package com.ibm.streamsets.interview.domain;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record User(
    String id,
    String name,
    String email
) {
}
