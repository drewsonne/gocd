/*************************GO-LICENSE-START*********************************
 * Copyright 2014 ThoughtWorks, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *************************GO-LICENSE-END***********************************/

package com.thoughtworks.go.plugin.access.common.settings;

import com.thoughtworks.go.plugin.api.config.PluginPreference;

public class PluginSettings implements PluginPreference {
    private PluginSettingsConfiguration configuration;
    private String template;

    public PluginSettings(PluginSettingsConfiguration configuration, String template) {
        this.configuration = configuration;
        this.template = template;
    }

    public PluginSettingsConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(PluginSettingsConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
}