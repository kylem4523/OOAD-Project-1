package com.company;

public class Zookeeper {
    //Array that contains all of the animals in the zoo
    Animal animals[];

    //Constructor initialized with the animals array.
    public Zookeeper(Animal animals[]){
        this.animals = animals;
    }

    //Method that wakes up all the animals in the zoo by displaying the appropriate strings.
    public void wakeAnimals(){
        System.out.println("Waking the animals");
        for(int i = 0; i < animals.length; i++){
            String animalName = animals[i].name;
            String type = String.valueOf(animals[i].getClass());
            type = type.replace("class com.company.", "");

            System.out.println(animalName);
            System.out.println(type);
            animals[i].wakeUp();

        }
    }
    //Method that performs a roll call on all of the zoo animals by displaying the appropriate strings.
    public void rollCall(){
        System.out.println("Roll Call!");
        for(int i = 0; i < animals.length; i++){
            String animalName = animals[i].name;
            String type = String.valueOf(animals[i].getClass());
            type = type.replace("class com.company.", "");

            System.out.println(animalName);
            System.out.println(type);
            animals[i].makeNoise();

        }
    }
    //Method that is called to feed all of the zoo animals by displaying the appropriate strings.
    public void feedAnimals(){
        System.out.println("Feeding the Animals");
        for(int i = 0; i < animals.length; i++){
            String animalName = animals[i].name;
            String type = String.valueOf(animals[i].getClass());
            type = type.replace("class com.company.", "");

            System.out.println(animalName);
            System.out.println(type);
            animals[i].eat();

        }
    }
    //Method that is called to exercise all of the zoo animals by displaying the appropriate strings.
    public void excerciseAnimals(){
        System.out.println("Exercising the Animals");
        for(int i = 0; i < animals.length; i++){
            String animalName = animals[i].name;
            String type = String.valueOf(animals[i].getClass());
            type = type.replace("class com.company.", "");

            System.out.println(animalName);
            System.out.println(type);
            animals[i].roam();
        }
    }
    //Method that is called to shut down the zoo for the day by displaying the appropriate strings.
    public void shutDown(){
        System.out.println("Shutting down the zoo");
        for(int i = 0; i < animals.length; i++){
            String animalName = animals[i].name;
            String type = String.valueOf(animals[i].getClass());
            type = type.replace("class com.company.", "");

            System.out.println(animalName);
            System.out.println(type);
            animals[i].sleep();
        }
    }



}
