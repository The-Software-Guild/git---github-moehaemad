package com.mycompany.mavenproject1.ClassesObjects;

public class SimpleCalculator {
    
    private float x, y;
    SimpleCalculator(){
        this.x=0;
        this.y=0;
    }
    
    SimpleCalculator(float x, float y){
        this.x = x;
        this.y = y;
    }
    
    //can only add if value is int
    public float add(){
        return x+y;
    }

    public float add(float x, float y){
        this.x = x;
        this.y = y;
        return add();
    }
    
    public float subtract(){
        return x-y;
    }
    
    public float subtract(float x, float y){
        this.x = x;
        this.y = y;
        return subtract();
    }
    
    public float multiplication(){
        return x*y;
    }
    
    public float multiplication(float x, float y){
        this.x = x;
        this.y = y;
        return multiplication();
    }
    
    
    public float[] divide(){
        float [] toReturn = {x/y, x%y};
        return toReturn;
    }
    
    public float[] divide(float x, float y){
        this.x = x;
        this.y = y;
        return divide();
    }
}
