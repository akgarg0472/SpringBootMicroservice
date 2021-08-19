package com.akgarg.contactmicroservice.service;

import com.akgarg.contactmicroservice.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    private final List<Contact> contacts;

    public ContactServiceImpl() {
        // again this data is supposed to come from the database
        // but currently working on fake dummy data only
        this.contacts = new ArrayList<>();
        contacts.add(new Contact(1001, "Contact #1001", "1234567890", 101));
        contacts.add(new Contact(1002, "Contact #1002", "1928374650", 101));
        contacts.add(new Contact(1003, "Contact #1003", "9876543201", 101));
        contacts.add(new Contact(1004, "Contact #1004", "1234567890", 101));
        contacts.add(new Contact(1005, "Contact #1005", "5649574956", 102));
        contacts.add(new Contact(1007, "Contact #1007", "5895856660", 103));
        contacts.add(new Contact(1008, "Contact #1008", "8895856660", 103));
        contacts.add(new Contact(1009, "Contact #1009", "5537556660", 103));
        contacts.add(new Contact(1010, "Contact #1010", "5537566660", 104));
        contacts.add(new Contact(1011, "Contact #1011", "553765660", 104));
    }

    @Override
    public List<Contact> getContacts(int userId) {
        return this.contacts.stream().filter(contact -> contact.getUserId() == userId).collect(Collectors.toList());
        /*
            this stream code is equivalent to following code:
                List<Contact> list = new ArrayList<>();
                for (Contact contact : this.contacts) {
                    if (contact.getUserId == userId) {
                        list.add(contact);
                    }
                }
                return list;
        * */
    }
}
