/*
 * Copyright (c) 2019 Cisco Systems, Inc. and/or its affiliates
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

package org.nipun.cisco.dnas.utils;


import java.io.InputStream;
import java.util.Properties;

/**
 * Utility to provide configuration needed by the application.
 */
public class ConfigUtil {

    /**
     * Reads configuratoins from a file which will be used wherever needed by the application
     *
     * @return Properties object containing list of configured application properties
     */
    public static Properties getConfig() {
        Properties prop = new Properties();
        try (InputStream input = ConfigUtil.class.getClassLoader().getResourceAsStream("app.properties")) {
            // load a properties file
            prop.load(input);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return prop;

    }


}
