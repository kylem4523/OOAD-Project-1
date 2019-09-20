package com.company;

public class Hippo extends Pachyderm {
    //Constructor with name parameter
    public Hippo(String name){
        this.name = name;
    }
    //Method that displays a hippo noise.
    public void makeNoise(){
        System.out.println("Grunt");
    }
}
