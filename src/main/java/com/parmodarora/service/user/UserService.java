package com.parmodarora.service.user;

import java.util.Collection;
import java.util.Optional;

import com.parmodarora.domain.User;
import com.parmodarora.domain.UserCreateForm;

public interface UserService {

    Optional<User> getUserById(long id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(UserCreateForm form);

}
