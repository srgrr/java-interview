package com.ibm.streamsets.interview.domain;

import com.ibm.streamsets.interview.domain.repository.UserRepository;
import com.ibm.streamsets.interview.domain.repository.UsersRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class Backend {

  @Inject
  UserRepository userRepository;

  @Inject
  UsersRepository usersRepository;

  public User createUser(User user) {
    return userRepository.saveUser(user);
  }

  public User getUser(String id) {
    return userRepository.getUser(id);
  }

  public User deleteUser(String id) {
    return userRepository.deleteUser(id);
  }

  public List<User> getUsersByEmail(String emailDomain) {
    return usersRepository.findUsersByEmail(emailDomain);
  }
}
