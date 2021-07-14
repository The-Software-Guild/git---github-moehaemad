package com.mycompany.mavenproject1.Basics;

import java.util.Scanner;

public class ScanPractice {

    /**
     * Insert in carriage return when prompted for Integer to test how carriage return is consumed on subsequnt calls.
     * */
    public static void integerMultipleLines(){
        
        Scanner myScanner = new Scanner(System.in);
        //enter in carriage return while trying to accept integers. make sure carriage return registers
        System.out.println("take in integer :");
        Integer mNumber = myScanner.nextInt();
        
        
        System.out.println("Now take in string: ");
        String mWord = myScanner.nextLine();
    
        System.out.println("you entered in the following number :" + mNumber + "and the word is: " + mWord);

    }
    
    /**
     * This is a simple scan class.
     * */
    public static void simpleScan(){
        Scanner mScanner = new Scanner(System.in);
    
        System.out.println("Enter in something");
    
        String word;
        word = mScanner.nextLine();
        System.out.println("you entered " + word);
        
    }

    public static void main(String[] args) {
        integerMultipleLines();
    }
}
