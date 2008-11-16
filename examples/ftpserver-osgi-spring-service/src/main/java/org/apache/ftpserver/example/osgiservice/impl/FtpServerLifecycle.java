/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */


package org.apache.ftpserver.example.osgiservice.impl;

import org.apache.ftpserver.FtpServer;

public class FtpServerLifecycle {

    private FtpServer server;
    
    public FtpServer getServer() {
        return server;
    }

    public void setServer(FtpServer server) {
        this.server = server;
    }

    public void init() throws Exception {
        server.start();
        System.out.println("Server started");
    }

    public void destroy() throws Exception {
        server.stop();
        System.out.println("Server stopped");
    }

}
