/*
 * IBM Confidential
 * PID 5900-BAF
 * Copyright StreamSets Inc., an IBM Company 2024
 */
package com.ibm.streamsets.interview.domain;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record User(
    String id,
    String name,
    String email
) {
}
