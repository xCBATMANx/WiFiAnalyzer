/*
 * WiFiAnalyzer
 * Copyright (C) 2019  VREM Software Development <VREMSoftwareDevelopment@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.vrem.wifianalyzer.settings;

import com.vrem.wifianalyzer.R;

import androidx.annotation.NonNull;

public class SettingsAndroidP extends Settings {

    SettingsAndroidP(@NonNull Repository repository) {
        super(repository);
    }

    @Override
    public int getScanSpeed() {
        return Math.max(super.getScanSpeed(), SCAN_SPEED_DEFAULT);
    }

    @Override
    public boolean isWiFiThrottleDisabled() {
        Repository repository = getRepository();
        boolean defaultValue = repository.getResourceBoolean(R.bool.wifi_throttle_disabled_default);
        return repository.getBoolean(R.string.wifi_throttle_disabled_key, defaultValue);
    }

}