/**
 * Copyright (C) 2016 Alfresco Software Limited.
 * <p/>
 * This file is part of the Alfresco SDK Samples project.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.activiti.extension.bean;

import com.activiti.api.engine.ProcessEngineConfigurationConfigurer;
import org.activiti.engine.impl.event.EventHandler;
import org.activiti.engine.impl.jobexecutor.JobHandler;
import org.activiti.spring.SpringProcessEngineConfiguration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author martin.bergljung@alfresco.com
 */
@Component
public class CustomProcessEngineConfiguration implements ProcessEngineConfigurationConfigurer {

    @Override
    public void processEngineConfigurationInitialized(SpringProcessEngineConfiguration configuration) {
        // Customize something...

        List<JobHandler> customJobHandlers = new ArrayList<>();
        configuration.setCustomJobHandlers(customJobHandlers);

        List<EventHandler> customEventHandlers = new ArrayList<>();
        configuration.setCustomEventHandlers(customEventHandlers);

        Set<String> customMybatisXMLMappers = new HashSet<>();
        configuration.setCustomMybatisXMLMappers(customMybatisXMLMappers);




    }
}


