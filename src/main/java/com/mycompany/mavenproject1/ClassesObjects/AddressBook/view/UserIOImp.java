package com.mycompany.mavenproject1.ClassesObjects.AddressBook.view;

import java.util.Scanner;

public class UserIOImp implements UserIO{
    private final Scanner mScanner;
    private Integer MAX, MIN;
    public UserIOImp(Integer min, Integer max){
        mScanner = new Scanner(System.in);
        MAX = max;
        MIN = min;
    }
    
    @Override
    public String readString(String messagePrompt) {
        System.out.printf(messagePrompt);
        return mScanner.next();
    }
    
    
    
    @Override
    public Integer getInt() {
        Integer result = -1;
        while(result < MIN || result > MAX){
            try{
                result = Integer.parseInt(mScanner.next());
            }catch(NumberFormatException exception){
                return -1;
            }
        }
        return result;
    }
    
    //TODO: consider removing this and doing without prompt
    @Override
    public Integer getInt(String prompt) {
        //iterate over the choice while the input is incorrect
        boolean incorrectInput = true;
        //store result of user here
        Integer result;
        while (incorrectInput){
            try{
                //parse input
                result = Integer.parseInt(mScanner.next());
                //check whether it's part of options
                if (result <= MAX && result >= MIN) {
                    incorrectInput = false;
                    return result;
                }
            }catch (NumberFormatException exception){
                return -1;
            }
        
        }
        //will not get to here but used for sake of method signature
        return -1;
    }
    
    /**
     * Keep checking if input is equal to 1 and if not we cannot continue with iteration
     * */
    @Override
    public void readEmpty() {
        String input="";
        while (!input.equalsIgnoreCase("1")){
            input = mScanner.next();
        }
    }
}
