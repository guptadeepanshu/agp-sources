/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.ddmlib;

import static com.android.ddmlib.Log.LogLevel.INFO;

import com.android.annotations.NonNull;
import com.android.annotations.Nullable;
import com.android.ddmlib.HeapSegment.HeapSegmentElement;
import com.android.ddmlib.internal.ClientImpl;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/** Contains the data of a {@link ClientImpl}. */
public class ClientData {
    /* This is a place to stash data associated with a Client, such as thread
     * states or heap data.  ClientData maps 1:1 to Client, but it's a little
     * cleaner if we separate the data out.
     *
     * Message handlers are welcome to stash arbitrary data here.
     *
     * IMPORTANT: The data here is written by HandleFoo methods and read by
     * FooPanel methods, which run in different threads.  All non-trivial
     * access should be synchronized against the ClientData object.
     */

    /** Temporary name of VM to be ignored. */
    public static final String PRE_INITIALIZED = "<pre-initialized>"; // $NON-NLS-1$

    private static final Names UNINITIALIZED = new Names(null, null, null);

    public enum DebuggerStatus {
        /** Debugger connection status: not waiting on one, not connected to one, but accepting
         * new connections. This is the default value. */
        DEFAULT,
        /**
         * Debugger connection status: the application's VM is paused, waiting for a debugger to
         * connect to it before resuming. */
        WAITING,
        /** Debugger connection status : Debugger is connected */
        ATTACHED,
        /** Debugger connection status: The listening port for debugger connection failed to listen.
         * No debugger will be able to connect. */
        ERROR
    }

    public enum AllocationTrackingStatus {
        /**
         * Allocation tracking status: unknown.
         *
         * <p>This happens right after a {@link ClientImpl} is discovered by the {@link
         * AndroidDebugBridge}, and before the {@link ClientImpl} answered the query regarding its
         * allocation tracking status.
         *
         * @see ClientImpl#requestAllocationStatus()
         */
        UNKNOWN,
        /** Allocation tracking status: the {@link ClientImpl} is not tracking allocations. */
        OFF,
        /** Allocation tracking status: the {@link ClientImpl} is tracking allocations. */
        ON
    }

    public enum MethodProfilingStatus {
        /**
         * Method profiling status: unknown.
         *
         * <p>This happens right after a {@link ClientImpl} is discovered by the {@link
         * AndroidDebugBridge}, and before the {@link ClientImpl} answered the query regarding its
         * method profiling status.
         *
         * @see ClientImpl#requestMethodProfilingStatus()
         */
        UNKNOWN,
        /** Method profiling status: the {@link ClientImpl} is not profiling method calls. */
        OFF,
        /** Method profiling status: the {@link ClientImpl} is tracing method calls. */
        TRACER_ON,
        /** Method profiling status: the {@link ClientImpl} is being profiled via sampling. */
        SAMPLER_ON
    }

    /**
     * String for feature enabling starting/stopping method profiling
     * @see #hasFeature(String)
     */
    public static final String FEATURE_PROFILING = "method-trace-profiling"; //$NON-NLS-1$

    /**
     * String for feature enabling direct streaming of method profiling data
     * @see #hasFeature(String)
     */
    public static final String FEATURE_PROFILING_STREAMING = "method-trace-profiling-streaming"; //$NON-NLS-1$

    /**
     * String for feature enabling sampling profiler.
     * @see #hasFeature(String)
     */
    public static final String FEATURE_SAMPLING_PROFILER = "method-sample-profiling"; //$NON-NLS-1$

    /**
     * String for feature indicating support for tracing OpenGL calls.
     * @see #hasFeature(String)
     */
    public static final String FEATURE_OPENGL_TRACING = "opengl-tracing"; //$NON-NLS-1$

    /**
     * String for feature indicating support for providing view hierarchy.
     * @see #hasFeature(String)
     */
    public static final String FEATURE_VIEW_HIERARCHY = "view-hierarchy"; //$NON-NLS-1$

    /**
     * String for feature allowing to dump hprof files
     * @see #hasFeature(String)
     */
    public static final String FEATURE_HPROF = "hprof-heap-dump"; //$NON-NLS-1$

    /**
     * String for feature allowing direct streaming of hprof dumps
     * @see #hasFeature(String)
     */
    public static final String FEATURE_HPROF_STREAMING = "hprof-heap-dump-streaming"; //$NON-NLS-1$

    @Deprecated
    private static IHprofDumpHandler sHprofDumpHandler;
    private static IMethodProfilingHandler sMethodProfilingHandler;
    private static IAllocationTrackingHandler sAllocationTrackingHandler;

    // owning Client
    private final Client mClient;

    // the client's process ID
    private final int mPid;

    // Java VM identification string
    private String mVmIdentifier;

    // client's self-description
    private Names mClientNames = UNINITIALIZED;

    // client's ABI
    private String mAbi;

    // jvm flag: currently only indicates whether checkJni is enabled
    private String mJvmFlags;

    // is the app native debuggable?
    private boolean mNativeDebuggable = false;

    // how interested are we in a debugger?
    private DebuggerStatus mDebuggerInterest;

    // List of supported features by the client.
    private final HashSet<String> mFeatures = new HashSet<String>();

    // Thread tracking (THCR, THDE).
    private TreeMap<Integer,ThreadInfo> mThreadMap;

    /** VM Heap data */
    private final HeapData mHeapData = new HeapData();
    /** Native Heap data */
    private final HeapData mNativeHeapData = new HeapData();

    /** Hprof data */
    private HprofData mHprofData = null;

    private HashMap<Integer, HeapInfo> mHeapInfoMap = new HashMap<Integer, HeapInfo>();

    /** library map info. Stored here since the backtrace data
     * is computed on a need to display basis.
     */
    private ArrayList<NativeLibraryMapInfo> mNativeLibMapInfo =
        new ArrayList<NativeLibraryMapInfo>();

    /** Native Alloc info list */
    private ArrayList<NativeAllocationInfo> mNativeAllocationList =
        new ArrayList<NativeAllocationInfo>();
    private int mNativeTotalMemory;

    private byte[] mAllocationsData;
    private AllocationInfo[] mAllocations;
    private AllocationTrackingStatus mAllocationStatus = AllocationTrackingStatus.UNKNOWN;

    @Deprecated
    private String mPendingHprofDump;

    private MethodProfilingStatus mProfilingStatus = MethodProfilingStatus.UNKNOWN;
    private String mPendingMethodProfiling;

    /**
     * Heap Information.
     * <p>The heap is composed of several {@link HeapSegment} objects.
     * <p>A call to {@link #isHeapDataComplete()} will indicate if the segments (available through
     * {@link #getHeapSegments()}) represent the full heap.
     */
    public static class HeapData {
        private TreeSet<HeapSegment> mHeapSegments = new TreeSet<HeapSegment>();
        private boolean mHeapDataComplete = false;
        private byte[] mProcessedHeapData;
        private Map<Integer, ArrayList<HeapSegmentElement>> mProcessedHeapMap;

        /**
         * Abandon the current list of heap segments.
         */
        public synchronized void clearHeapData() {
            /* Abandon the old segments instead of just calling .clear().
             * This lets the user hold onto the old set if it wants to.
             */
            mHeapSegments = new TreeSet<HeapSegment>();
            mHeapDataComplete = false;
        }

        /**
         * Add raw HPSG chunk data to the list of heap segments.
         *
         * @param data The raw data from an HPSG chunk.
         */
        public synchronized void addHeapData(ByteBuffer data) {
            HeapSegment hs;

            if (mHeapDataComplete) {
                clearHeapData();
            }

            try {
                hs = new HeapSegment(data);
            } catch (BufferUnderflowException e) {
                System.err.println("Discarding short HPSG data (length " + data.limit() + ")");
                return;
            }

            mHeapSegments.add(hs);
        }

        /** Called when all heap data has arrived. */
        public synchronized void sealHeapData() {
            mHeapDataComplete = true;
        }

        /**
         * Returns whether the heap data has been sealed.
         */
        public boolean isHeapDataComplete() {
            return mHeapDataComplete;
        }

        /**
         * Get the collected heap data, if sealed.
         *
         * @return The list of heap segments if the heap data has been sealed, or null if it hasn't.
         */
        public Collection<HeapSegment> getHeapSegments() {
            if (isHeapDataComplete()) {
                return mHeapSegments;
            }
            return null;
        }

        /**
         * Sets the processed heap data.
         *
         * @param heapData The new heap data (can be null)
         */
        public void setProcessedHeapData(byte[] heapData) {
            mProcessedHeapData = heapData;
        }

        /**
         * Get the processed heap data, if present.
         *
         * @return the processed heap data, or null.
         */
        public byte[] getProcessedHeapData() {
            return mProcessedHeapData;
        }

        public void setProcessedHeapMap(Map<Integer, ArrayList<HeapSegmentElement>> heapMap) {
            mProcessedHeapMap = heapMap;
        }

        public Map<Integer, ArrayList<HeapSegmentElement>> getProcessedHeapMap() {
            return mProcessedHeapMap;
        }
    }

    public static class HeapInfo {
        public long maxSizeInBytes;
        public long sizeInBytes;
        public long bytesAllocated;
        public long objectsAllocated;
        public long timeStamp;
        public byte reason;

        public HeapInfo(long maxSizeInBytes,
                        long sizeInBytes,
                        long bytesAllocated,
                        long objectsAllocated,
                        long timeStamp,
                        byte reason) {
            this.maxSizeInBytes = maxSizeInBytes;
            this.sizeInBytes = sizeInBytes;
            this.bytesAllocated = bytesAllocated;
            this.objectsAllocated = objectsAllocated;
            this.timeStamp = timeStamp;
            this.reason = reason;
        }
    }

    public static class HprofData {
        public enum Type {
            FILE,
            DATA
        }

        public final Type type;
        public final String filename;
        public final byte[] data;

        public HprofData(@NonNull String filename) {
            type = Type.FILE;
            this.filename = filename;
            this.data = null;
        }

        public HprofData(@NonNull byte[] data) {
            type = Type.DATA;
            this.data = data;
            this.filename = null;
        }
    }

    /**
     * Handlers able to act on HPROF dumps.
     */
    @Deprecated
    public interface IHprofDumpHandler {
        /**
         * Called when a HPROF dump succeeded.
         * @param remoteFilePath the device-side path of the HPROF file.
         * @param client the client for which the HPROF file was.
         */
        void onSuccess(String remoteFilePath, Client client);

        /**
         * Called when a HPROF dump was successful.
         * @param data the data containing the HPROF file, streamed from the VM
         * @param client the client that was profiled.
         */
        void onSuccess(byte[] data, Client client);

        /**
         * Called when a hprof dump failed to end on the VM side
         * @param client the client that was profiled.
         * @param message an optional (<code>null</code> ok) error message to be displayed.
         */
        void onEndFailure(Client client, String message);
    }

    /**
     * Handlers able to act on Method profiling info
     */
    public interface IMethodProfilingHandler {
        /**
         * Called when a method tracing was successful.
         * @param remoteFilePath the device-side path of the trace file.
         * @param client the client that was profiled.
         */
        void onSuccess(String remoteFilePath, Client client);

        /**
         * Called when a method tracing was successful.
         * @param data the data containing the trace file, streamed from the VM
         * @param client the client that was profiled.
         */
        void onSuccess(byte[] data, Client client);

        /**
         * Called when method tracing failed to start
         * @param client the client that was profiled.
         * @param message an optional (<code>null</code> ok) error message to be displayed.
         */
        void onStartFailure(Client client, String message);

        /**
         * Called when method tracing failed to end on the VM side
         * @param client the client that was profiled.
         * @param message an optional (<code>null</code> ok) error message to be displayed.
         */
        void onEndFailure(Client client, String message);
    }

    /*
     * Handlers able to act on allocation tracking info
     */
    public interface IAllocationTrackingHandler {
        /**
         * Called when an allocation tracking was successful.
         *
         * @param data the data containing the encoded allocations. See {@link
         *     AllocationsParser#parse(ByteBuffer)} for parsing this data.
         * @param client the client for which allocations were tracked.
         */
        void onSuccess(@NonNull byte[] data, @NonNull Client client);
    }

    public void setHprofData(byte[] data) {
        mHprofData = new HprofData(data);
    }

    public void setHprofData(String filename) {
        mHprofData = new HprofData(filename);
    }

    public void clearHprofData() {
        mHprofData = null;
    }

    public HprofData getHprofData() {
        return mHprofData;
    }

    /**
     * Sets the handler to receive notifications when an HPROF dump succeeded or failed.
     * This method is deprecated, please register a client listener and listen for CHANGE_HPROF.
     */
    @Deprecated
    public static void setHprofDumpHandler(IHprofDumpHandler handler) {
        sHprofDumpHandler = handler;
    }

    @Deprecated
    public static IHprofDumpHandler getHprofDumpHandler() {
        return sHprofDumpHandler;
    }

    /**
     * Sets the handler to receive notifications when an HPROF dump succeeded or failed.
     * This method is deprecated, please register a client listener and listen for CHANGE_HPROF.
     */
    public static void setMethodProfilingHandler(IMethodProfilingHandler handler) {
        sMethodProfilingHandler = handler;
    }

    public static IMethodProfilingHandler getMethodProfilingHandler() {
        return sMethodProfilingHandler;
    }

    /**
     * This method is deprecated. Please register an {@link
     * AndroidDebugBridge.IClientChangeListener} with {@link
     * AndroidDebugBridge#addClientChangeListener(AndroidDebugBridge.IClientChangeListener)}
     */
    @Deprecated
    public static void setAllocationTrackingHandler(IAllocationTrackingHandler handler) {
        sAllocationTrackingHandler = handler;
    }

    @Deprecated
    @Nullable
    public static IAllocationTrackingHandler getAllocationTrackingHandler() {
        return sAllocationTrackingHandler;
    }

    /** Generic constructor. */
    public ClientData(@NonNull Client client, int pid) {
        mClient = client;
        mPid = pid;

        mDebuggerInterest = DebuggerStatus.DEFAULT;
        mThreadMap = new TreeMap<Integer, ThreadInfo>();

        // Log pid to help troubleshoot "Cannot connect to debugger" issued.
        if (Log.isAtLeast(INFO)) {
            String msg =
                    String.format(Locale.US, "Device '%s' ", client.getDevice().getName())
                            + String.format(Locale.US, "tracking jdwp process (pid=%d)", pid);
            Log.i("ddms_client", msg);
        }
    }

    /**
     * Returns the process ID.
     */
    public int getPid() {
        return mPid;
    }

    /**
     * Returns the Client's VM identifier.
     */
    public String getVmIdentifier() {
        return mVmIdentifier;
    }

    /** Sets VM identifier. */
    public void setVmIdentifier(String ident) {
        mVmIdentifier = ident;
    }

    /**
     * @deprecated Use {@link #getProcessName} instead.
     */
    @Deprecated()
    @Nullable
    public String getClientDescription() {
        return getProcessName();
    }

    /**
     * Returns the process name.
     *
     * <p>This is generally the name of the package defined in the <code>AndroidManifest.xml</code>.
     *
     * @return the process name or <code>null</code> if not the process name was not yet sent
     *     by the client.
     */
    @Nullable
    public String getProcessName() {
        return mClientNames.mProcessName;
    }

    /**
     * Returns the client's user id.
     * @return user id if set, -1 otherwise
     */
    public int getUserId() {
        return mClientNames.mUserId == null ? -1 : mClientNames.mUserId;
    }

    /**
     * Returns true if the user id of this client was set. Only devices that support multiple
     * users will actually return the user id to ddms. For other/older devices, this will not
     * be set.
     */
    public boolean isValidUserId() {
        return mClientNames != UNINITIALIZED;
    }

    /** Returns the abi flavor (32-bit or 64-bit) of the application, null if unknown or not set. */
    @Nullable
    public String getAbi() {
        return mAbi;
    }

    /** Returns the VM flags in use, or null if unknown. */
    public String getJvmFlags() {
        return mJvmFlags;
    }

    /**
     * Sets the process, user ID (i.e. personal vs work profile), and package names.
     *
     * <p>There may be a race between HELO and APNM. Rather than try to enforce ordering on the
     * device, we just don't allow the pre-initialized name to replace a specified one.
     */
    public void setNames(Names names) {
        /*
         * The application VM is first named <pre-initialized> before being assigned
         * its real name.
         * Depending on the timing, we can get an APNM chunk setting this name before
         * another one setting the final actual name. So if we get a SetClientDescription
         * with this value we ignore it.
         */
        if (!names.mProcessName.isEmpty() && !PRE_INITIALIZED.equals(names.mProcessName)) {
            mClientNames = names;

            // Log when pid gets a name to debug issue likes "Cannot connect to debugger"
            if (Log.isAtLeast(INFO)) {
                String msg =
                        String.format(Locale.US, "Device '%s' ", mClient.getDevice().getName())
                                + String.format(
                                        Locale.US,
                                        "jdwp process '%d' is now known as pkg='%s' (proc='%s')",
                                        getPid(),
                                        names.mPackageName,
                                        names.mProcessName);
                Log.i("ddms_client", msg);
            }
        }
    }

    public void setAbi(String abi) {
        mAbi = abi;
    }

    public void setJvmFlags(String jvmFlags) {
        mJvmFlags = jvmFlags;
    }

    public boolean isNativeDebuggable() {
        return mNativeDebuggable;
    }

    public void setNativeDebuggable(boolean nativeDebuggable) {
        mNativeDebuggable = nativeDebuggable;
    }

    /**
     * Returns the debugger connection status.
     */
    public DebuggerStatus getDebuggerConnectionStatus() {
        return mDebuggerInterest;
    }

    /** Sets debugger connection status. */
    public void setDebuggerConnectionStatus(DebuggerStatus status) {
        mDebuggerInterest = status;
    }

    /**
     * Sets the current heap info values for the specified heap.
     *
     * @param heapId The heap whose info to update
     * @param sizeInBytes The size of the heap, in bytes
     * @param bytesAllocated The number of bytes currently allocated in the heap
     * @param objectsAllocated The number of objects currently allocated in
     * @param timeStamp
     * @param reason
     */
    public synchronized void setHeapInfo(
            int heapId,
            long maxSizeInBytes,
            long sizeInBytes,
            long bytesAllocated,
            long objectsAllocated,
            long timeStamp,
            byte reason) {
        mHeapInfoMap.put(heapId, new HeapInfo(maxSizeInBytes, sizeInBytes, bytesAllocated,
                objectsAllocated, timeStamp, reason));
    }

    /**
     * Returns the {@link HeapData} object for the VM.
     */
    public HeapData getVmHeapData() {
        return mHeapData;
    }

    /** Returns the {@link HeapData} object for the native code. */
    public HeapData getNativeHeapData() {
        return mNativeHeapData;
    }

    /**
     * Returns an iterator over the list of known VM heap ids.
     * <p>
     * The caller must synchronize on the {@link ClientData} object while iterating.
     *
     * @return an iterator over the list of heap ids
     */
    public synchronized Iterator<Integer> getVmHeapIds() {
        return mHeapInfoMap.keySet().iterator();
    }

    /**
     * Returns the most-recent info values for the specified VM heap.
     *
     * @param heapId The heap whose info should be returned
     * @return a map containing the info values for the specified heap.
     *         Returns <code>null</code> if the heap ID is unknown.
     */
    public synchronized HeapInfo getVmHeapInfo(int heapId) {
        return mHeapInfoMap.get(heapId);
    }

    /** Adds a new thread to the list. */
    public synchronized void addThread(int threadId, String threadName) {
        ThreadInfo attr = new ThreadInfo(threadId, threadName);
        mThreadMap.put(threadId, attr);
    }

    /** Removes a thread from the list. */
    public synchronized void removeThread(int threadId) {
        mThreadMap.remove(threadId);
    }

    /**
     * Returns the list of threads as {@link ThreadInfo} objects.
     *
     * <p>The list is empty until a thread update was requested with {@link
     * ClientImpl#requestThreadUpdate()}.
     */
    public synchronized ThreadInfo[] getThreads() {
        Collection<ThreadInfo> threads = mThreadMap.values();
        return threads.toArray(new ThreadInfo[0]);
    }

    /** Returns the {@link ThreadInfo} by thread id. */
    public synchronized ThreadInfo getThread(int threadId) {
        return mThreadMap.get(threadId);
    }

    public synchronized void clearThreads() {
        mThreadMap.clear();
    }

    /**
     * Returns the list of {@link NativeAllocationInfo}.
     *
     * @see ClientImpl#requestNativeHeapInformation()
     */
    public synchronized List<NativeAllocationInfo> getNativeAllocationList() {
        return Collections.unmodifiableList(mNativeAllocationList);
    }

    /**
     * adds a new {@link NativeAllocationInfo} to the {@link ClientImpl}
     *
     * @param allocInfo The {@link NativeAllocationInfo} to add.
     */
    public synchronized void addNativeAllocation(NativeAllocationInfo allocInfo) {
        mNativeAllocationList.add(allocInfo);
    }

    /** Clear the current malloc info. */
    public synchronized void clearNativeAllocationInfo() {
        mNativeAllocationList.clear();
    }

    /**
     * Returns the total native memory.
     *
     * @see ClientImpl#requestNativeHeapInformation()
     */
    public synchronized int getTotalNativeMemory() {
        return mNativeTotalMemory;
    }

    public synchronized void setTotalNativeMemory(int totalMemory) {
        mNativeTotalMemory = totalMemory;
    }

    public synchronized void addNativeLibraryMapInfo(long startAddr, long endAddr, String library) {
        mNativeLibMapInfo.add(new NativeLibraryMapInfo(startAddr, endAddr, library));
    }

    /**
     * Returns the list of native libraries mapped in memory for this client.
     */
    public synchronized List<NativeLibraryMapInfo> getMappedNativeLibraries() {
        return Collections.unmodifiableList(mNativeLibMapInfo);
    }

    public synchronized void setAllocationStatus(AllocationTrackingStatus status) {
        mAllocationStatus = status;
    }

    /**
     * Returns the allocation tracking status.
     *
     * @see ClientImpl#requestAllocationStatus()
     */
    public synchronized AllocationTrackingStatus getAllocationStatus() {
        return mAllocationStatus;
    }

    public synchronized void setAllocationsData(byte[] data) {
        mAllocationsData = data;
    }

    /**
     * Returns the raw data for tracked allocations.
     *
     * @see ClientImpl#requestAllocationDetails()
     */
    public synchronized byte[] getAllocationsData() {
        return mAllocationsData;
    }

    @Deprecated
    synchronized void setAllocations(AllocationInfo[] allocs) {
        mAllocations = allocs;
    }

    /**
     * Returns the list of tracked allocations.
     *
     * @see ClientImpl#requestAllocationDetails()
     */
    @Nullable
    public synchronized AllocationInfo[] getAllocations() {
        if (mAllocationsData != null) {
            return AllocationsParser.parse(ByteBuffer.wrap(mAllocationsData));
        }
        return null;
    }

    public void addFeature(String feature) {
        mFeatures.add(feature);
    }

    /**
     * Returns true if the {@link ClientImpl} supports the given <var>feature</var>
     *
     * @param feature The feature to test.
     * @return true if the feature is supported
     * @see ClientData#FEATURE_PROFILING
     * @see ClientData#FEATURE_HPROF
     */
    public boolean hasFeature(String feature) {
        return mFeatures.contains(feature);
    }

    /**
     * Sets the device-side path to the hprof file being written
     *
     * @param pendingHprofDump the file to the hprof file
     */
    @Deprecated
    public void setPendingHprofDump(String pendingHprofDump) {
        mPendingHprofDump = pendingHprofDump;
    }

    /** Returns the path to the device-side hprof file being written. */
    @Deprecated
    public String getPendingHprofDump() {
        return mPendingHprofDump;
    }

    @Deprecated
    public boolean hasPendingHprofDump() {
        return mPendingHprofDump != null;
    }

    public synchronized void setMethodProfilingStatus(MethodProfilingStatus status) {
        mProfilingStatus = status;
    }

    /**
     * Returns the method profiling status.
     *
     * @see ClientImpl#requestMethodProfilingStatus()
     */
    public synchronized MethodProfilingStatus getMethodProfilingStatus() {
        return mProfilingStatus;
    }

    /**
     * Sets the device-side path to the method profile file being written
     *
     * @param pendingMethodProfiling the file being written
     */
    public void setPendingMethodProfiling(String pendingMethodProfiling) {
        mPendingMethodProfiling = pendingMethodProfiling;
    }

    /** Returns the path to the device-side method profiling file being written. */
    public String getPendingMethodProfiling() {
        return mPendingMethodProfiling;
    }

    /**
     * Returns the application's real package name if there is protocol support. If there is no
     * protocol support, returns the attempted derivation of the package name from the app name (to
     * maintain backward compatibility), or the app name if not successful.
     */
    @Nullable
    public String getPackageName() {
        // Use the reported package name if the version (R+) supports it.
        if (mClient.getDevice().supportsFeature(IDevice.Feature.REAL_PKG_NAME)) {
            return mClientNames.mPackageName;
        }
        // Try to infer the package name.
        // Check for multi-process app name that might have a following format - "$applicationId:$processName"
        if (mClientNames.mProcessName == null) {
            return null;
        }
        int colonPos = mClientNames.mProcessName.indexOf(':');
        return (colonPos == -1)
                ? mClientNames.mProcessName
                : mClientNames.mProcessName.substring(0, colonPos);
    }

    /**
     * Returns the application's data directory.
     */
    @NonNull
    public String getDataDir() {
        String packageName = getPackageName();

        if (isValidUserId() && getUserId() > 0) {
            return String.format("/data/user/%d/%s", getUserId(), packageName);
        }
        return "/data/data/" + packageName;
    }

    public static class Names {
        public final String mProcessName;
        public final Integer mUserId;
        public final String mPackageName;

        public Names(String processName, Integer id, String packageName) {
            this.mProcessName = processName;
            mUserId = id;
            this.mPackageName = packageName;
        }
    }
}

