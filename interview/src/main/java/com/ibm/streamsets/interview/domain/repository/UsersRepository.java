package com.ibm.streamsets.interview.domain.repository;

import com.ibm.streamsets.interview.domain.User;

import java.util.List;

public interface UsersRepository {
  List<User> findUsersByEmail(String emailDomain);
}
