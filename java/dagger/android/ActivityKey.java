/*
 * Copyright (C) 2016 The Dagger Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dagger.android;

import static java.lang.annotation.ElementType.METHOD;

import android.app.Activity;
import dagger.MapKey;
import dagger.internal.Beta;
import java.lang.annotation.Documented;
import java.lang.annotation.Target;

/**
 * {@link MapKey} annotation to key bindings by a type of an {@link Activity}.
 *
 * @deprecated Use {@link dagger.multibindings.ClassKey} instead. See <a
 *     href="https://google.github.io/dagger/android">https://google.github.io/dagger/android</a>.
 */
@Beta
@MapKey
@Documented
@Target(METHOD)
@Deprecated
public @interface ActivityKey {
  Class<? extends Activity> value();
}
