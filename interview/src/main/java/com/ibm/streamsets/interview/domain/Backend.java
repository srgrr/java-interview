package com.ibm.streamsets.interview.domain;

import com.ibm.streamsets.interview.domain.repository.UserRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class Backend {

  @Inject
  UserRepository userRepository;

  public User createUser(User user) {
    return userRepository.saveUser(user);
  }
}
