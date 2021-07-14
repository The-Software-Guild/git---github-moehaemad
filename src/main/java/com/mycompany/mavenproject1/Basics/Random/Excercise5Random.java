package com.mycompany.mavenproject1.Basics.Random;

import java.util.Random;
import java.util.Scanner;

public class Excercise5Random {
    
    
    static public class Opinionator{
    
    
        public static void main(String[] args) {
            Random randomizer = new Random();
            System.out.println("I can't decide what animal I like the best.");
            System.out.println("I know! Random can decide FOR ME!");
            //bug: originally used 5 as upper bound but .nextInt goes from 0 to 4 so just add 1
            int x = randomizer.nextInt(5 + 1);
        
            System.out.println("The number we chose was: " + x);
        
            switch (x) {
                case 0:
                    System.out.println("Llamas are the best!");
                    break;
                case 1:
                    System.out.println("Dodos are the best!");
                    break;
                case 2:
                    System.out.println("Woolly mammoths are DEFINITELY the best!");
                    break;
                case 3:
                    System.out.println("Sharks are the greatest, they have their own week!");
                    break;
                case 4:
                    System.out.println("Cockatoos are just so awesomme!");
                    break;
                case 5:
                    System.out.println("Have you ever met a naked mole-rat? They're GREAT!");
                    break;
            }
        
            System.out.println("Thanks Random, maybe YOU'RE the best!");
        }
    }
    
    static public class FortuneCookie{
    
    
        public static void main(String[] args) {
            String[] quotes = {"Those aren't the droids you're looking for.",
                    "Never go in against a Sicilian when death is on the line!",
                    "Goonies never say die.", "With great power, there must also come — great responsibility.",
                    "Never argue with the data.", "Try not. Do, or do not. There is no try.",
                    "You are a leaf on the wind, watch how you soar.",
                    "Do absolutely nothing, and it will be everything that you thought it could be.",
                    "Kneel before Zod.", "Make it so."
            };
            
            Random mRandom = new Random();
            //index list of quotes with random number from 0 to length of array -1.
            System.out.println(quotes[mRandom.nextInt(quotes.length)]);
            
        }
    }
    
    static public class HighRoller{
    
        public static void main(String[] args) {
            Scanner mScanner = new Scanner(System.in);
            int sides;
            System.out.println("How many sides does a die have?");
            sides = mScanner.nextInt();
            Random diceRoller = new Random();
    
            int rollResult = diceRoller.nextInt(sides) + 1;
    
            System.out.println("TIME TO ROOOOOOLL THE DICE!");
            System.out.println("I rolled a " + rollResult);
    
            if (rollResult == 1) {
                System.out.println("You rolled a critical failure!");
            }else if (rollResult == sides){
                System.out.println("You rolled a critical! Nice job!");
            
            }
        }
    }
    
    static public class CoinFlipper{
    
    
        public static void main(String[] args) {
            Random mRandom = new Random();
            
            boolean flip = mRandom.nextBoolean();
            System.out.println("Ready, Set, Flip....!!");
            if (flip){
                System.out.println("You got HEADS!");
            }else{
                System.out.println("You got TAILS!");
            }
        }
    }
    
    static public class GuessMeMore{
    
        public static void main(String[] args) {
            Scanner mScanner = new Scanner(System.in);
            System.out.println("pick a number from -100 to 100");
            Random mRandom = new Random();
            Integer mRandNumber = mRandom.nextInt(200) - 100;
            Integer mNum =  Integer.parseInt(mScanner.nextLine());
            System.out.println("number is " + mRandNumber);
            while (mNum != mRandNumber){
                if (mNum == mRandNumber){
                    System.out.println("Congratulations, you picked the only number I care about");
                }else{
                    System.out.println("Try choosing a different number");
                    String hotOrCold = (mNum > mRandNumber ? " < " : " > ");
                    System.out.println("Try " + hotOrCold);
                    mNum = Integer.parseInt(mScanner.nextLine());
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Opinionator.main(null);
        System.out.println("---------------------");
        FortuneCookie.main(null);
        System.out.println("---------------------");
        CoinFlipper.main(null);
        System.out.println("---------------------");
        // GuessMeMore.main(null);
        int count =0 ;
        for (int i = 0; i< 14; i++){
            count ++;
            System.out.println(count);
        }
        
    }
}
