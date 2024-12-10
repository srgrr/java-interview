package com.ibm.streamsets.interview.controllers;

import com.ibm.streamsets.interview.domain.Backend;
import com.ibm.streamsets.interview.domain.User;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import jakarta.inject.Inject;

import java.util.List;

@Controller("/users")
public class UsersController {

  @Inject
  Backend backend;

  @Get
  public HttpResponse<List<User>> getUsers(@QueryValue String emailDomain) {
    List<User> retrievedUsers = backend.getUsersByEmail(emailDomain);
    return HttpResponse.ok(retrievedUsers);
  }
}
