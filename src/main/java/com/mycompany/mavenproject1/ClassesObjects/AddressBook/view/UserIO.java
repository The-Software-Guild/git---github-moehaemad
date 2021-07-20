package com.mycompany.mavenproject1.ClassesObjects.AddressBook.view;

public interface UserIO {
//    get String input with a message
    String readString(String messagePrompt);
//    get an integer within range without a prompt
    //    eg. get choices for the list of prompts
    Integer getInt();
//    get an integer with a prompt
    Integer getInt(String prompt);
    
    void readEmpty();
    
}
