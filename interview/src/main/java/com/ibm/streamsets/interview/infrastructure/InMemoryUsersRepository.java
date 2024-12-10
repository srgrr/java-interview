package com.ibm.streamsets.interview.infrastructure;

import com.ibm.streamsets.interview.domain.User;
import com.ibm.streamsets.interview.domain.repository.UsersRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class InMemoryUsersRepository implements UsersRepository {
  @Inject
  InMemoryUserRepository userRepository;

  @Override
  public List<User> findUsersByEmail(String emailDomain) {
    // TODO: Your code goes here :)
    return List.of();
  }
}
