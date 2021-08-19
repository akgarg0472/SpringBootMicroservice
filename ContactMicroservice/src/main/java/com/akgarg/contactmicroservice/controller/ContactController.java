package com.akgarg.contactmicroservice.controller;

import com.akgarg.contactmicroservice.entity.Contact;
import com.akgarg.contactmicroservice.service.ContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    private final ContactServiceImpl contactService;

    @Autowired
    public ContactController(ContactServiceImpl contactService) {
        this.contactService = contactService;
    }

    @RequestMapping("/user/{userId}")
    public List<Contact> getContacts(@PathVariable("userId") int userId) {
        return this.contactService.getContacts(userId);
    }
}