/*
 Copyright 2014 Groupon, Inc.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
*/
package com.groupon.odo.plugin;

import javax.servlet.http.HttpServletResponse;
import org.apache.commons.httpclient.HttpMethod;

public class PluginArguments {
    private HttpServletResponse response;
    private HttpRequestInfo originalRequest;
    private HttpMethod httpMethodProxyRequest;

    public PluginArguments(HttpServletResponse response, HttpRequestInfo request, HttpMethod modifiedRequest) {
        this.response = response;
        this.originalRequest = request;
        this.httpMethodProxyRequest = modifiedRequest;
    }

    public HttpServletResponse getResponse() {
        return response;
    }

    public HttpRequestInfo getOriginalRequest() {
        return originalRequest;
    }

    public HttpMethod getHttpMethodProxyRequest() {
        return httpMethodProxyRequest;
    }
}
