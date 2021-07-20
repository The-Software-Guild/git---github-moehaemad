package com.mycompany.mavenproject1.ClassesObjects.ClassRoster.dao;

public class ClassRosterDaoException extends Exception{

    public ClassRosterDaoException(String message){
        super(message);
    }
    
    public ClassRosterDaoException(String message, Throwable throwing){
        super(message, throwing);
    }
}
