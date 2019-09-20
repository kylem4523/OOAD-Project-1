package com.company;

public abstract class Pachyderm extends Animal {
    //Method that display's a string letting the user know that this animal roams like a Pachyderm.
    public void roam(){
        System.out.println("Pachyderm-like Roaming");
    }
    //Abstract method that is handled by the subclass.
    abstract void makeNoise();

}
