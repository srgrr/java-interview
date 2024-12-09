package com.ibm.streamsets.interview.domain;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record Post(
    String id,
    String creatorId,
    String title
) {
}
