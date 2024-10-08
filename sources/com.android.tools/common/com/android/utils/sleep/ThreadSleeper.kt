/*
 * Copyright (C) 2022 The Android Open Source Project
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
package com.android.utils.sleep

import java.util.concurrent.TimeUnit
import kotlin.time.Duration
import kotlin.time.ExperimentalTime
import kotlin.time.toDuration
import kotlin.time.toDurationUnit

/** Object that wraps calls to `Thread.sleep` so they can be tested. See [TestThreadSleeper]. */
sealed class ThreadSleeper {
  protected abstract fun doSleep(millis: Long, nanos: Int)

  @OptIn(ExperimentalTime::class) // For Duration which is no longer experimental
  @JvmSynthetic
  fun sleep(duration: Duration) {
    if (duration > Duration.ZERO) duration.toMillisAndNanos().let { (m, n) -> sleep(m, n) }
  }

  fun sleep(millis: Long, nanos: Int) {
    if (millis > 0 || nanos > 0) doSleep(millis, nanos)
  }

  fun sleep(millis: Long) {
    sleep(millis, 0)
  }

  @OptIn(ExperimentalTime::class) // For DurationUnit which is no longer experimental
  fun sleep(num: Long, unit: TimeUnit) {
    if (num > 0) sleep(num.toDuration(unit.toDurationUnit()))
  }

  /** Standard implementation of [ThreadSleeper] using `Thread.sleep`. */
  companion object INSTANCE : ThreadSleeper() {
    override fun doSleep(millis: Long, nanos: Int) {
      Thread.sleep(millis, nanos)
    }
  }
}

@OptIn(ExperimentalTime::class) // For Duration which is no longer experimental
private fun Duration.toMillisAndNanos(): Pair<Long, Int> =
  // toComponents returns SECONDS and nanoseconds, so we need to use modulus to ignore
  // the portion of the nanoseconds value that is >= 1 millisecond.
  inWholeMilliseconds to toComponents { _, n -> n % 1_000_000 }
