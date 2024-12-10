/*
 * IBM Confidential
 * PID 5900-BAF
 * Copyright StreamSets Inc., an IBM Company 2024
 */
package com.ibm.streamsets.interview.infrastructure;

import com.ibm.streamsets.interview.domain.repository.UsersRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;


@Singleton
public class InMemoryUsersRepository implements UsersRepository {
  // Hint: we added a .getMemory() method in userRepository for your convenience ;)
  @Inject
  InMemoryUserRepository userRepository;
}
