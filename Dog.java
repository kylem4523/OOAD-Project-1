package com.company;

public class Dog extends Canine {
    //Constructor with name parameter.
    public Dog(String name){
        this.name = name;
    }
    //Method that displays a dog noise.
    public void makeNoise(){
        System.out.println("Woof");
    }
}
