package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = myNumber;
    }
    public boolean addNewContact(String contact){
        if (contact){
            return false;
        }
        return true;
    }
}
