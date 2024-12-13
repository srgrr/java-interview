/*
 * IBM Confidential
 * PID 5900-BAF
 * Copyright StreamSets Inc., an IBM Company 2024
 */
package com.ibm.streamsets.interview.infrastructure;

import com.ibm.streamsets.interview.domain.User;
import com.ibm.streamsets.interview.domain.repository.UserRepository;
import jakarta.inject.Singleton;

import java.util.HashMap;
import java.util.Map;

@Singleton
public class InMemoryUserRepository implements UserRepository {

  private final Map<String, User> memory = new HashMap<>();

  @Override
  public User saveUser(User user) {
    memory.put(user.id(), user);
    return user;
  }

  @Override
  public User getUser(String userId) {
    return memory.get(userId);
  }

  @Override
  public User deleteUser(String userId) {
    return memory.remove(userId);
  }

  public Map<String, User> getMemory() {
    return memory;
  }
}
