package com.akgarg.usermicroservice.controller;

import com.akgarg.usermicroservice.entity.User;
import com.akgarg.usermicroservice.entity.UserNotFoundError;
import com.akgarg.usermicroservice.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserServiceImpl userService;
    private final RestTemplate restTemplate;

    @Autowired
    public UserController(UserServiceImpl userService, RestTemplate restTemplate) {
        this.userService = userService;
        this.restTemplate = restTemplate;
    }

    @RequestMapping("/{userId}")
    public ResponseEntity<?> user(@PathVariable int userId) {
        User user = this.userService.getUser(userId);

        if (user != null) {
            List contacts = restTemplate.getForObject("http://contact-service/contacts/user/" + userId, List.class);
            user.setContacts(contacts);
        }

        return ResponseEntity.ok(user != null ? user : new UserNotFoundError(userId));
    }


    @RequestMapping("/all")
    public List<User> getAllUsers() {
        return this.userService.getAllUsers();
    }
}