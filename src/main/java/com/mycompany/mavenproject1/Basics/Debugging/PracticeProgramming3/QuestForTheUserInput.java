package com.mycompany.mavenproject1.Basics.Debugging.PracticeProgramming3;

import java.util.Scanner;

public class QuestForTheUserInput {
    
    
    public static void main(String[] args) {
        
        Scanner mScanner = new Scanner(System.in);
    
        System.out.println("enter in the name");
        
        String name = mScanner.nextLine();
    
        System.out.println("name: " + name);
    }
}
