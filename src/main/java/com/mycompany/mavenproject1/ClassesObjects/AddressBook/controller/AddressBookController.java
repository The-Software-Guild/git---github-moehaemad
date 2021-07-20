package com.mycompany.mavenproject1.ClassesObjects.AddressBook.controller;

import com.mycompany.mavenproject1.ClassesObjects.AddressBook.model.AddressBookDao;
import com.mycompany.mavenproject1.ClassesObjects.AddressBook.model.dto.Address;
import com.mycompany.mavenproject1.ClassesObjects.AddressBook.view.AddressBookView;

public class AddressBookController {
    AddressBookDao addressBookDao;
    AddressBookView mView;
    public AddressBookController(AddressBookDao dao, AddressBookView mView){
        this.addressBookDao = dao;
        this.mView = mView;
    }
    
    
    public void run() {
        boolean exit = false;
        int choice;
        while (!exit){
            choice = initialPrompt();
            switch (choice){
                case 1:
                    addAddress();
                    break;
                case 2:
                    deleteAddress();
                    break;
                case 3:
                    findAddress();
                    break;
                case 4:
                    addressCount();
                    break;
                case 5:
                    listAddresses();
                    break;
                case 6:
                    //call exit which will return true to assign to variable
                    exit = exit();
                    break;
            }
            //continue the iteration if the exit variable hasn't already been set
            if (!exit) mView.continueIteration();

        }
    
    }
    
    private boolean exit() {
        System.out.println("\nExiting");
        return true;
    }
    
    /**
     * show main menu
     * */
    public int initialPrompt(){
        mView.initialMenuBanner();
        return mView.initialMenu();
    }
    
    /**
     * Add addresses
     * */
    public void addAddress(){
        Address toAdd = mView.addAddress();
        addressBookDao.insertAddress(toAdd);
        mView.displaySuccess("added");
    }
    
    /**
     * list addresses
     * */
    public void listAddresses(){
        mView.listAddressMenu(addressBookDao.getAddresses());
    }
    
    /**
     * Display address count
     * */
    public void addressCount(){
        mView.addressCount(addressBookDao.sizeAddresses());
    }
    
    /**
     * ask user for last name to find the address of and then display it.
     * */
    public void findAddress(){
        String toFindLastName = mView.findAddress();
        Address toDisplay = addressBookDao.findAddress(toFindLastName);
        mView.displayAddress(toDisplay);
        
    }
    
    /**
     * Delete the address.
     * */
    public void deleteAddress(){
        String toDeleteKey = mView.deleteAddress();
        addressBookDao.deleteAddress(toDeleteKey);
        mView.displaySuccess("deleted");
    }
}
