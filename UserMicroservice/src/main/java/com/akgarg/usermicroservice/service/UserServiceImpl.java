package com.akgarg.usermicroservice.service;

import com.akgarg.usermicroservice.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final List<User> users;

    public UserServiceImpl() {
        // this data is supposed to come from the database but here working on dummy data
        this.users = new ArrayList<>();
        users.add(new User(101, "User #101", "Delhi"));
        users.add(new User(102, "User #102", "Gurugram"));
        users.add(new User(103, "User #103", "Noida"));
        users.add(new User(104, "User #104", "Uttrakhand"));
    }

    @Override
    public User getUser(int id) {
        return this.users.stream().filter(user -> user.getUserId() == id).findAny().orElse(null);
        /* stream code equivalent to following code
                for (User user : this.users) {
                    if (user.getUserId() == id) {
                        return user;
                    }
                }
                return null;
        */
    }

    @Override
    public List<User> getAllUsers() {
        return this.users;
    }
}
