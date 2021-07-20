package com.mycompany.mavenproject1.ClassesObjects.AddressBook.view;

import com.mycompany.mavenproject1.ClassesObjects.AddressBook.model.dto.Address;
import com.mycompany.mavenproject1.ClassesObjects.ClassRoster.dto.Student;
import com.mycompany.mavenproject1.ClassesObjects.ClassRoster.ui.UserIOConsoleImpl;

import java.util.Collection;
import java.util.List;

public class AddressBookView {
    private UserIO mConsole;
    public AddressBookView(UserIO io){
        mConsole = io;
    }
    
    public void displaySuccess(String message){
        System.out.printf("Address %s%n", message);
    }
    
    /**
     * Add address.
     * */
    public Address addAddress(){
        String firstName, lastName, street, city, state, zip;
        firstName = mConsole.readString(String.format("%n%nAdd Address Menu:%n\tPlease enter first name:"));
        lastName = mConsole.readString(String.format("\tPlease enter last name:"));
        street = mConsole.readString(String.format("\tPlease enter street address:"));
        city = mConsole.readString(String.format("\tPlease enter city:"));
        state = mConsole.readString(String.format("\tPlease enter state:"));
        zip = mConsole.readString(String.format("\tPlease enter zip:"));
        return new Address(firstName,
                lastName,
                street,
                city,
                state,
                zip);
    }
    
    /**
     * Prompt deletion of address by using last name as key to return to controller.
     * */
    public String deleteAddress(){
        System.out.printf("Delete Address Menu:%n");
        return mConsole.readString(String.format("\tPlease enter last name of address to delete:%n"));
    }
    
    /**
     * Ask user to last name of owner that they're looking for and return that last name.
     * */
    public String findAddress(){
                /*        Find Address Menu:
        Please enter last name of address to find:*/
        return mConsole.readString(String.format("Find Address Menu:%n\tPlease enter last name of address to find:"));
    
    }
    
    /**
     * Display address given.
     * */
    public void displayAddress(Address toDisplay){
        //TODO: fix out of this format and not use string.join
        System.out.printf("List Addresses Menu:%n\t%s%n\t%s%n\t%s",
                String.join(toDisplay.firstName,
                        "\t",
                        toDisplay.lastName),
                toDisplay.streetAddress,
                String.join(toDisplay.city,
                        ",\n",
                        toDisplay.state,
                        ",\n",
                        toDisplay.zip));
    }
    
    /**
     * Display the count of addresses stored.
     * */
    public void addressCount(int size){
        System.out.printf("List Address Count Menu:%n\tThere are %d addresses in the book.", size);
    }
    
    /**
     * Banner for first menu.
     * */
    public void initialMenuBanner(){
        System.out.printf("%n%n==========%nInitialMenu:%n");
    }
    
    /**
     * Provide the first menu user interacts with and provide back the selection choice to controller.
     * */
    public int initialMenu(){
        /*    ==========
Initial Menu:
      Please select the operation you wish to perform:
            1. Add Address
            2. Delete Address
            3. Find Address
            4. List Address Count
            5. List All Addresses
        * */
        String formattedPrompt = String.format("\tPlease select the operation you wish to perform: %n\t1)%s%n\t2)%s%n\t3)%s" +
                        "%n\t4)%s%n\t5)%s%n\t6)%s%n%n",
                "Add Address",
                "Delete Address",
                "Find Address",
                "List Address Count",
                "List All Addresses",
                "exit");
        System.out.printf(formattedPrompt);
        return mConsole.getInt();
    }
    
    /**
     * Iterate through list of addresses and display them
     *
     * */
    public void listAddressMenu(Collection<Address> addressList){
        for (Address i: addressList){
            //first name and lastname
            //street
            //city, state, zip
            displayAddress(i);
        }
    }
    
    /**
     * ask to press enter.
     * */
    public void continueIteration(){
        System.out.printf("\nPlease press 1 to continue:");
        mConsole.readEmpty();
    }
}
