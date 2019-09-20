package com.company;
//Animal superclass
public abstract class Animal {
    //Every Animal has a name attribute
    public String name;
    //Constructor for Animal class
   public Animal(){};
    //Displays string when animal goes to sleep
   public void sleep(){
       System.out.println("Sleeping");
   }
    //Displays string when animal wakes up
   public void wakeUp(){
       System.out.println("Waking up");
   }
    //Displays string when animal eats
   public void eat(){
       System.out.println("Eating");
   }
    //Abstract method that will be handled in the lowest subclass
   abstract void makeNoise();
    //Abstract method that will be handled in the intermediate subclass
   abstract void roam();

}
