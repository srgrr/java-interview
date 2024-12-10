/*
 * IBM Confidential
 * PID 5900-BAF
 * Copyright StreamSets Inc., an IBM Company 2024
 */
package com.ibm.streamsets.interview.controllers;
import com.ibm.streamsets.interview.domain.Backend;
import com.ibm.streamsets.interview.domain.User;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

@Controller("/users")
public class UsersController {

  @Inject
  Backend backend;

  @Get
  @Operation(summary = "Retrieve users with email domain filter", description = "Return list of all users that gave email in given domain")
  public HttpResponse<List<User>> getUsers(@Parameter(description = "Search email domain") @QueryValue String emailDomain) {
    // TODO: Your code goes here :)
    return null;
  }
}
