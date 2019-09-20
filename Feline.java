package com.company;

public abstract class Feline extends Animal {
    //Method that display's a string letting the user know that this animal roams like a Feline.
    public void roam(){
        System.out.println("Feline-like Roaming");
    }
    //Abstract method that is handled by the subclass.
    abstract void makeNoise();
}
