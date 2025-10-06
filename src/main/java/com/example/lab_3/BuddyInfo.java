package com.example.lab_3;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class BuddyInfo {
    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String phoneNumber;
    @ManyToOne
    private AddressBook book;

    public BuddyInfo(){
        this.name = "";
        this.phoneNumber = "";
    };

    public BuddyInfo(String phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setBook(AddressBook book) {
        this.book = book;
    }

    public AddressBook getBook() {
        return book;
    }

    @Override
    public String toString() {
        return "BuddyInfo{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
