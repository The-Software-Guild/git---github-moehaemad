package com.mycompany.mavenproject1.ClassesObjects;

import java.util.Arrays;
import java.util.Scanner;

public class FactorsRefactored {
    private Integer mNum;
    
    public FactorsRefactored(){
        this.mNum=0;
    }
    
    public FactorsRefactored(Integer num) {
        this.mNum = num;
    }
    
    public void startProgram(){
        if (mNum == 0){
            //grab input from user
            Scanner mScanner = new Scanner(System.in);
            System.out.println("Please provide number to look factors for.");
            this.mNum = mScanner.nextInt();
        }
    
        //get factors of number
        Integer[] factors = factors(mNum);
    
        outPutStats(factors, mNum);
    }
    
    
    
    public static void outPutStats(Integer[] factors, int mNum){
        //use Arrays.toString([]) to turn the Integer array into a string
        System.out.println("The total number of factors are : " + Arrays.toString(factors));
    
        //check whether number is a perfect
        if (isPerfect(factors, mNum)){
            System.out.println("The number is Perfect");
        }
    
        //there will only be two factors and in order to be prime it will be 1 and the number itself
        //make sure to check the user didn't enter in a negative number because factors will be Integer[0]
        if (factors.length != 0 && factors[0] == 1 && factors[1] == mNum){
            System.out.println("The number is a Prime number");
        }
    }
    
    public static Integer[] factors (int num){
        if (num <= 0){
            return new Integer[0];
        }
        //create integer array the size of number in case each number is a factor which is likely not case.
        Integer[] factors = new Integer[num];
        //keep track of index of where to put array because no method to push into array
        int indexOfArray=0;
        //iterate through list of numbers
        for (int i=1; i<=num; i++){
            //check if there is a divisor and if 0 then
            if (num % i == 0){
                factors[indexOfArray] = i;
                indexOfArray++;
            }
        }
        return factors;
    }
    
    public static boolean isPerfect(Integer[] numArr, int num){
        //check for empty array or if prime because Prime number cannot be perfect since sum of divisors doesn't equal number.
        if (numArr.length == 0 || numArr.length <=2){
            return false;
        }
        int sum=0;
        //iterate over the list of numbers and find sum
        for (int i=0; i < numArr.length; i++){
            //sum elements but don't include null entries or the number itself since that is not in definition for Perfect.
            if (numArr[i] == null || numArr[i] == num) continue;
            sum += numArr[i];
        }
        return num == sum;
    }
    
}
