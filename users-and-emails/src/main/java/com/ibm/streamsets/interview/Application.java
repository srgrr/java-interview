/*
 * IBM Confidential
 * PID 5900-BAF
 * Copyright StreamSets Inc., an IBM Company 2024
 */
package com.ibm.streamsets.interview;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
    info = @Info(
        title = "java-interview",
        version = "1.0"
    ), servers = @Server(url = "http://localhost:8080")
)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}