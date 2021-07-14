package com.mycompany.mavenproject1.Basics.Debugging.PracticeProgramming3;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class MiniMadLibs {
    
    public static void main(String[] args) {
    
        Scanner mScanner = new Scanner(System.in);
        System.out.println("enter in some noun");
        String noun = mScanner.nextLine();
        System.out.println("enter in some other adjective");
        String adjective = mScanner.nextLine();
    
        System.out.println("the adlib: " + noun + " and " + adjective);
    }
}
