package com.mycompany.mavenproject1.ClassesObjects.AddressBook.model;

import com.mycompany.mavenproject1.ClassesObjects.AddressBook.model.dto.Address;

import java.util.*;

public class AddressBookDao {
    Map<String, Address> mAddresses;
    
    public AddressBookDao(){
        this.mAddresses = new HashMap();
    }
    
    public void insertAddress (Address newAddress){ ;
        this.mAddresses.put(newAddress.lastName, newAddress);
    }
    
    /**
     * return the values of the map
     * */
    public Collection<Address> getAddresses (){
        return this.mAddresses.values();
    }
    
    /**
     * return the size of the addresses collection.
     * */
    public int sizeAddresses(){
        return this.mAddresses.size();
    }
    
    /**
     * Iterate over each Map entry and check for key-value pair that matches the last name using Map.Entry interface.
     * */
    public Address findAddress(String lastName){
        Address toReturn = new Address();
        for (Map.Entry<String, Address> i : this.mAddresses.entrySet()){
            if (i.getKey().equalsIgnoreCase(lastName)) toReturn = i.getValue();
        }
        return toReturn;
    }
    
    /**
     * remove an address from the map
     * */
    public void deleteAddress(String lastName){
        mAddresses.remove(lastName);
    }


}
