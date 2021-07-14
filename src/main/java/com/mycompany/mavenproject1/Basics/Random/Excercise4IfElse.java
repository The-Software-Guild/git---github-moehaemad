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
            if (mNum == 1){
                System.out.println("congratulations, you picked the only number I care about");
            }
            int arr[] = new int[4];
        }
    }
    
    static public class YourLifeInMovies{
    
        public static void main(String[] args) {
            Scanner mScanner = new Scanner(System.in);
            boolean stop = false;
            Integer number;
            System.out.println("pick a year of a movie");
            do{
                number = mScanner.nextInt();
                if (number >= 2000) {
                    System.out.println("good to go");
                    stop = true;
                }else{
                    System.out.println("try again");
                }
                
            }while (!stop);
        }
    }
    
    static public class FieldDay{
    
    
        public static void main(String[] args) {
            String first = "abc";
            String second = "def";
    
            System.out.println("the .compare");
        }
    }
    
    public static void main(String[] args) {
        // LlamasWhalesAnddodosOhMy.main(new String[10]);
        // GuessMe.main(null);
        YourLifeInMovies.main(null);
        
    }
}
