package com.company;
import java.util.Random;

public class Cat extends Feline{
    //Constructor with name parameter.
    public Cat(String name){
        this.name = name;
    }

    //Method that displays a random cat noise from a pre-determined array of cat noises.
    public void makeNoise(){
        String [] noises = {"Meow", "Hiss", "Purr"};
        int noiseLength = noises.length;
        Random random = new Random();
        int randInt = random.nextInt(noiseLength );
        System.out.printf("%s%n", noises[randInt]);
    }
}
