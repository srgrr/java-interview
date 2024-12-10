/*
 * IBM Confidential
 * PID 5900-BAF
 * Copyright StreamSets Inc., an IBM Company 2024
 */
package com.ibm.streamsets.interview.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ibm.streamsets.interview.domain.User;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;

import java.util.UUID;

@Introspected
@Serdeable
public record UserCreationRequest(
    String name,
    String email
) {
  @JsonIgnore
  public User user() {
    return new User(UUID.randomUUID().toString(), name, email);
  }
}
