/*
 * Copyright 2011 Rodrigo Damazio
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.damazio.notifier;

public class Constants {

    /**
     * The tag to use for all logging done in the application.
     */
    public static final String TAG = "RemoteNotifier";

    /**
     * Name of the preferences, as generated by
     * {@link android.preference.PreferenceManager#getDefaultSharedPreferences}.
     */
    public static final String PREFERENCES_NAME = "org.damazio.notifier_preferences";

    /**
     * Maximum time after which a notification will still be sent.
     */
    public static final int MAX_NOTIFICATION_AGE_SEC = 10 * 60;
}
