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

package org.apache.ftpserver.ftpletcontainer;

import java.util.Map;

import org.apache.ftpserver.ftplet.FtpException;
import org.apache.ftpserver.ftplet.Ftplet;

/**
 * Interface describing an Ftplet container. Ftplet containers extend the
 * {@link Ftplet} interface and forward any events to the Ftplets hosted by the
 * container.
 *
 * @author The Apache MINA Project (dev@mina.apache.org)
 * @version $Rev$, $Date$
 */
public interface FtpletContainer extends Ftplet {

    /**
     * Add an {@link Ftplet} to the container.
     * 
     * @param name
     *            The name of the Ftplet to be added
     * @param ftplet
     *            The Ftplet
     * @throws FtpException 
     * @throws IllegalArgumentException
     *             If an Ftplet with the same name already exist within the
     *             container
     */
    void addFtplet(String name, Ftplet ftplet) throws FtpException;

    /**
     * Remove the {@link Ftplet} identified by the name (as provided in the
     * {@link #addFtplet(String, Ftplet)} method.
     * 
     * @param name
     *            The name of the Ftplet to be removed
     * @return The removed Ftplet if found, or null if the name is unknown to
     *         the container.
     */
    Ftplet removeFtplet(String name);

    /**
     * Retrive the {@link Ftplet} identified by the name (as provided in the
     * {@link #addFtplet(String, Ftplet)} method.
     * 
     * @param name
     *            The name of the Ftplet to retrive
     * @return The Ftplet if found, or null if the name is unknown to the
     *         container.
     */
    Ftplet getFtplet(String name);

    /**
     * Retrive all Ftplets registered with this container
     * 
     * @return A map of all Ftplets with their name as the key
     */
    Map<String, Ftplet> getFtplets();

    /**
     * Set the Ftplets for this container. Will remove all previously registred
     * Ftplets in this container
     * 
     * @param ftplets
     *            A map of all Ftplets with their name as the key
     */
    void setFtplets(Map<String, Ftplet> ftplets);
}