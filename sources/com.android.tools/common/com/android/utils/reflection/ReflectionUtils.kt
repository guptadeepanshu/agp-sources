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

package com.android.utils.reflection

import kotlin.reflect.KProperty

/**
 * Computes the qualified name of a property.
 *
 * Can be used for creating instances of `Key` or `Logger` that should know their own name:
 *
 * `val MY_KEY: Key<Boolean> = Key.create(::MY_KEY.qualifiedName<T>())`.
 */
inline fun <reified T>  KProperty<*>.qualifiedName(): String = T::class.java.name + "." + this.name
