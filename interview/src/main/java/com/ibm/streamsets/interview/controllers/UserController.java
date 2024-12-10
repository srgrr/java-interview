/*
 * IBM Confidential
 * PID 5900-BAF
 * Copyright StreamSets Inc., an IBM Company 2024
 */
package com.ibm.streamsets.interview.controllers;

import com.ibm.streamsets.interview.domain.Backend;
import com.ibm.streamsets.interview.domain.User;
import com.ibm.streamsets.interview.dto.UserCreationRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;
import jakarta.inject.Inject;

@Controller("/user")
public class UserController {

  @Inject
  Backend backend;

  @Post
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<User> createUser(@Body UserCreationRequest request) {
    User storedUser = backend.createUser(request.user());
    return HttpResponse.ok(storedUser);
  }

  @Get(uri = "{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<User> getUser(String id) {
    User retrievedUser = backend.getUser(id);
    return HttpResponse.ok(retrievedUser);
  }

  @Delete(uri = "{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<User> deleteUser(String id) {
    User deletedUser = backend.deleteUser(id);
    return HttpResponse.ok(deletedUser);
  }
}
