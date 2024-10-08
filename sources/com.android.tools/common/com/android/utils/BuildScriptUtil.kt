/*
 * Copyright (C) 2019 The Android Open Source Project
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
@file:JvmName("BuildScriptUtil")

package com.android.utils

import com.android.SdkConstants.EXT_GRADLE
import com.android.SdkConstants.EXT_GRADLE_KTS
import com.android.SdkConstants.EXT_GRADLE_DECLARATIVE
import com.android.SdkConstants.FN_BUILD_GRADLE
import com.android.SdkConstants.FN_BUILD_GRADLE_DECLARATIVE
import com.android.SdkConstants.FN_BUILD_GRADLE_KTS
import com.android.SdkConstants.FN_SETTINGS_GRADLE
import com.android.SdkConstants.FN_SETTINGS_GRADLE_DECLARATIVE
import com.android.SdkConstants.FN_SETTINGS_GRADLE_KTS
import java.io.File

/**
 * Returns the path of a build.gradle or build.gradle.kts file in the directory at the given
 * [dirPath]. build.gradle.kts is only returned when build.gradle doesn't exist and
 * build.gradle.kts does exist.
 *
 * Please note that the build.gradle file may not exist at the returned path.
 *
 * __Note__: Do __not__ use this method if you are calling from the IDE and have a reference to
 * a module, in these cases prefer to use the path contained within the module's Gradle facet.
 *
 * This method returns the path of a build.gradle or build.gradle.kts file in the directory at
 * the given path.
 */
fun findGradleBuildFile(dirPath: File) : File {
  val groovyBuildFile = File(dirPath, FN_BUILD_GRADLE)
  if (groovyBuildFile.isFile) return groovyBuildFile
  val kotlinBuildFile = File(dirPath, FN_BUILD_GRADLE_KTS)
  if (kotlinBuildFile.isFile) return kotlinBuildFile
  val declarativeBuildFile = File(dirPath, FN_BUILD_GRADLE_DECLARATIVE)
  if (declarativeBuildFile.isFile) return declarativeBuildFile

  // Default to Groovy if none exist.
  return groovyBuildFile
}

/**
 * Returns the path of a settings.gradle or settings.gradle.kts file in the directory at the given
 * [dirPath]. settings.gradle.kts is only returned when settings.gradle doesn't exist and
 * settings.gradle.kts does exist.
 *
 * Please note that the settings.gradle file may not exist at the returned path.
 *
 * This method returns the path of a settings.gradle or settings.gradle.kts file in the directory at
 * the given path.
 */
fun findGradleSettingsFile(dirPath: File) : File {
  val groovySettingsFile = File(dirPath, FN_SETTINGS_GRADLE)
  if (groovySettingsFile.isFile) return groovySettingsFile
  val kotlinSettingsFile = File(dirPath, FN_SETTINGS_GRADLE_KTS)
  if (kotlinSettingsFile.isFile) return kotlinSettingsFile
  val declarativeSettingsFile = File(dirPath, FN_SETTINGS_GRADLE_DECLARATIVE)
  if (declarativeSettingsFile.isFile) return declarativeSettingsFile

  // Default to Groovy if none exist.
  return groovySettingsFile
}
