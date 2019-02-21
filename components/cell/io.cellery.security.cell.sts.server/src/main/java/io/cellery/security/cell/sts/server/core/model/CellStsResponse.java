/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */
package io.cellery.security.cell.sts.server.core.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Model object to store Response from STS.
 */
public class CellStsResponse {

    private Map<String, String> responseHeaders = new HashMap<>();

    public Map<String, String> getResponseHeaders() {

        return Collections.unmodifiableMap(responseHeaders);
    }

    public void addResponseHeaders(Map<String, String> responseHeaders) {

        this.responseHeaders.putAll(responseHeaders);
    }

    public void addResponseHeader(String key, String value) {

        this.responseHeaders.put(key, value);
    }
}
