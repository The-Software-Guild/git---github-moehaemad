package com.mycompany.mavenproject1.ClassesObjects.AddressBook.model.dto;

public class Address {
    public String firstName;
    public String lastName;
    public String streetAddress;
    public String city;
    public String state;
    public String zip;
    
    public Address(){
        firstName = "";
        lastName = "";
        streetAddress = "";
        city = "";
        state = "";
        zip = "";
    }
    
    public Address(String firstName, String lastName, String street, String city, String state, String zip){
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    
    
}
