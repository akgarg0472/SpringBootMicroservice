package com.akgarg.usermicroservice.service;

import com.akgarg.usermicroservice.entity.User;

import java.util.List;

public interface UserService {
    User getUser(int id);

    List<User> getAllUsers();
}
