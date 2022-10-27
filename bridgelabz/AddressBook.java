package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner (System.in);
    public static void main (String[]args){
        System.out.println("Welcome to address book system program");
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();

    }
    public void addContact(){
        System.out.println("create new contact");
        System.out.println("enter  first name ");
        String firstName= sc.next();
        System.out.println("enter last name ");
        String lastName= sc.next();
        System.out.println("enter phone number ");
        String phoneNumber = sc.next();
        System.out.println("enter email id ");
        String emailId = sc.next();
        System.out.println("enter city name ");
        String city = sc.next();
        System.out.println("enter state name ");
        String state = sc.next();
        System.out.println("enter zip");
        String zip = sc.next();

        Contact newContact= new Contact();
        Address address= new Address();
        displayContact(newContact);
        displayAddress(address);
        newContact.setFirstName(firstName);
        newContact.setLastName(lastName);
        newContact.setPhoneNumber(phoneNumber);
        newContact.setEmailId(emailId);
        address.setCity(city);
        address.setState(state);
        address.setZip(zip);
        sc.close();
        
    }

    public void displayContact(Contact contact){
        System.out.println(contact);


    }
    public void displayAddress(Address address){
        System.out.println(address);

    }
}
