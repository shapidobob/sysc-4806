package com.example.lab_3;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook {
    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    @Override
    public String toString() {
        String s = "AddressBook{" +
                "buddies=";
        for (BuddyInfo buddy: buddies){
            s += buddy.toString();
        }
        return s;
    }

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<BuddyInfo> buddies;

    public void addBuddy(BuddyInfo  buddy){
        //buddy.setBook(this);
        buddies.add(buddy);
    }


    public List<BuddyInfo> getBuddies() {
        return buddies;
    }

    public void setID(int ID) {
        this.id = ID;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}