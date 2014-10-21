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
package org.damazio.notifier.prefs;

import org.damazio.notifier.Constants;

import android.app.backup.BackupAgentHelper;
import android.app.backup.SharedPreferencesBackupHelper;

/**
 * Backup agent for notifier data.
 *
 * @author Rodrigo Damazio
 */
public class BackupAgent extends BackupAgentHelper {
  @Override
  public void onCreate() {
    super.onCreate();

    addHelper("sharedPrefs", new SharedPreferencesBackupHelper(this, Constants.PREFERENCES_NAME));
    // TODO: Backup event log
  }
}
