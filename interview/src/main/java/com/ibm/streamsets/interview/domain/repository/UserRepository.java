/*
 * IBM Confidential
 * PID 5900-BAF
 * Copyright StreamSets Inc., an IBM Company 2024
 */
package com.ibm.streamsets.interview.domain.repository;

import com.ibm.streamsets.interview.domain.User;

public interface UserRepository {
  User saveUser(User user);
  User getUser(String userId);
  User deleteUser(String userId);
}
