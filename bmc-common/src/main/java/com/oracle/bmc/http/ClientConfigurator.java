/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

/**
 * Configurator allowing SDK users to customize the underlying REST client.
 */
public interface ClientConfigurator {

    /**
     * Customize the ClientBuilder instance.
     *
     * @param builder
     *            The client builder.
     */
    void customizeBuilder(ClientBuilder builder);

    /**
     * Customize the Client generated by the builder.
     *
     * @param client
     *            The client.
     */
    void customizeClient(Client client);
}
