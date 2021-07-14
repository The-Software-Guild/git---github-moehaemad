package com.mycompany.mavenproject1.Basics.Random;

import java.util.Scanner;

public class Excercise4IfElse {
    
    
    static public class LlamasWhalesAnddodosOhMy{
    
    
        public static void main(String[] args) {
            int llamas = 20;
    
            System.out.println("it's a lama if something = " + llamas);
        }
    }
    
    static public class GuessMe{
    
    
        public static void main(String[] args) {
            Scanner mScanner = new Scanner(System.in);
            System.out.println("pick a number");
            Integer mNum =  Integer.parseInt(mScanner.nextLine());
        }
    }
    
    
    public static void main(String[] args) {
        // LlamasWhalesAnddodosOhMy.main(new String[10]);
        GuessMe.main(null);
        
        
    }
}
