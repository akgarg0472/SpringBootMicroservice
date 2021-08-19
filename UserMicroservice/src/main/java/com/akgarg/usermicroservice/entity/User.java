package com.akgarg.usermicroservice.entity;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class User {
    private int userId;
    private String name;
    private String address;
    private List<Contact> contacts;

    public User() {
        this.contacts = new ArrayList<>();
    }

    public User(int userId, String name, String address) {
        this();
        this.userId = userId;
        this.name = name;
        this.address = address;
    }

    public User(int userId, String name, String address, List<Contact> contacts) {
        this();
        this.userId = userId;
        this.name = name;
        this.address = address;
        this.contacts = contacts;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}
