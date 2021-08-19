package com.akgarg.contactmicroservice.service;

import com.akgarg.contactmicroservice.entity.Contact;

import java.util.List;

public interface ContactService {
    List<Contact> getContacts(int userId);
}
