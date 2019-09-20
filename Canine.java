package com.company;

public abstract class Canine extends Animal {
    //Method that displays the roaming attribute for all Canine subclasses.
    public void roam(){
        System.out.println("Canine-like roaming");
    }
    //Abstract method that will be handled at the next sub-class.
    abstract void makeNoise();
}
