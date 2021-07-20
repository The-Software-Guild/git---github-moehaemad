package com.mycompany.mavenproject1.ClassesObjects.ClassRoster;

import com.mycompany.mavenproject1.ClassesObjects.ClassRoster.controller.ClassRosterController;
import com.mycompany.mavenproject1.ClassesObjects.ClassRoster.dao.ClassRosterDao;
import com.mycompany.mavenproject1.ClassesObjects.ClassRoster.dao.ClassRosterDaoFileImpl;
import com.mycompany.mavenproject1.ClassesObjects.ClassRoster.ui.ClassRosterView;
import com.mycompany.mavenproject1.ClassesObjects.ClassRoster.ui.UserIO;
import com.mycompany.mavenproject1.ClassesObjects.ClassRoster.ui.UserIOConsoleImpl;

public class App {
    
    
    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        ClassRosterView myView = new ClassRosterView(myIo);
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        ClassRosterController controller =
                new ClassRosterController(myDao, myView);
        controller.run();
    }
}
