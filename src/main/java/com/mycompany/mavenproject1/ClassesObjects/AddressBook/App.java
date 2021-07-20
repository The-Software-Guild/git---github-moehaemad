package com.mycompany.mavenproject1.ClassesObjects.AddressBook;

import com.mycompany.mavenproject1.ClassesObjects.AddressBook.controller.AddressBookController;
import com.mycompany.mavenproject1.ClassesObjects.AddressBook.model.AddressBookDao;
import com.mycompany.mavenproject1.ClassesObjects.AddressBook.view.AddressBookView;
import com.mycompany.mavenproject1.ClassesObjects.AddressBook.view.UserIO;
import com.mycompany.mavenproject1.ClassesObjects.AddressBook.view.UserIOImp;
import com.mycompany.mavenproject1.ClassesObjects.ClassRoster.ui.UserIOConsoleImpl;

public class App {
    
    public static void main(String[] args) {
        UserIO mConsole = new UserIOImp(1, 6);
        AddressBookView addressBookView = new AddressBookView(mConsole);
        AddressBookDao mDao = new AddressBookDao();
        AddressBookController controller = new AddressBookController(mDao, addressBookView);
        controller.run();
    }
}
