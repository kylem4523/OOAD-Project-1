package com.company;

import java.util.Random;

public class Lion extends Canine {
    //Constructor for lion with name parameter.
    public Lion(String name){
        this.name = name;
    }

    //Displays a string of a noise a lion might make.
    public void makeNoise(){
        String [] noises = {"I just can't wait to be Kinnnngggggg", "Everything the light touches is your kingdom"};
        int noiseLength = noises.length;
        Random random = new Random();
        int randInt = random.nextInt(noiseLength );
        System.out.printf("%s%n", noises[randInt]);
    }
}
