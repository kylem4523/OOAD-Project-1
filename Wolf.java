package com.company;

public class Wolf extends Canine {
    //Constructor with name parameter.
    public Wolf(String name){
        this.name = name;
    }
    //Method that makes a wolf noise.
    public void makeNoise(){
        System.out.println("Awoooooooooooooooo");
    }
}
