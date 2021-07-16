package com.mycompany.mavenproject1.ClassesObjects;

import java.util.Scanner;

public class App {
    
    public static void calculatorPrompts(){
        Scanner mScanner = new Scanner(System.in);
        System.out.printf("What operation of the following did you want to use?%n1)Add%n2)Subtract%n3)Multiply%n4)Divide" +
                "%nOR choose to exit by typing \"exit\"%n");
        String option = mScanner.next();
        
        while (!option.equalsIgnoreCase("EXIT")){
            System.out.println("What is the first operand?");
            String xStr = mScanner.next();
            System.out.println("What is the second operand?");
            String yStr = mScanner.next();
            int x = Integer.parseInt(xStr);
            int y = Integer.parseInt(yStr);
            SimpleCalculator mCalculator = new SimpleCalculator(x, y);
            switch(option.toUpperCase()){
                case "1":
                    System.out.printf("%nResult: %.2f%n", mCalculator.add());
                    break;
                case "2":
                    System.out.printf("%nResult: %.2f%n", mCalculator.subtract());
                    break;
                case "3":
                    System.out.printf("%nResult: %.2f%n", mCalculator.multiplication());
                    break;
                case "4":
                    float[] result = mCalculator.divide();
                    System.out.printf("%nResult: %.2f, remainder: %.2f%n", result[0], result[1]);
                    break;
            }
            System.out.printf("%nWhat operation of the following did you want to use?%n1)Add%n2)Subtract%n3)Multiply%n4)Divide" +
                    "%nOR choose to exit by typing \"exit\"%n");
            option = mScanner.next();
        }
    }
    
    
    public static void main(String[] args) {
        
        Scanner mScanner = new Scanner(System.in);
        System.out.printf("Please choose one from the following%n1)%s%n2)%s%n", "Factorizer", "SimpleCalculator");
        String option = mScanner.next();
        switch(option.toUpperCase().replaceAll("\\s+","")){
            case "1":
                FactorsRefactored mFactorizer = new FactorsRefactored();
                mFactorizer.startProgram();
                break;
            case "2":
                calculatorPrompts();
                break;
            default:
                System.out.println("No method chosen, exiting...");
                return;
        }
    }
}
