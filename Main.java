package com.company;

public class Main {

    public static void main(String[] args) {
            //Instantiating all of the different animals in the zoo.
            Animal Caesar = new Cat("Caesar");
            Animal Carlos = new Cat("Carlos");
            Animal Willy = new Wolf("Willy");
            Animal Wilbur = new Wolf("Wilbur");
            Animal Danny = new Dog("Danny");
            Animal Danielle = new Dog("Danielle");
            Animal Herby = new Hippo("Herby");
            Animal Harriet = new Hippo("Harriet");
            Animal Ezekiel = new Elephant("Ezekiel");
            Animal Elizabeth = new Elephant("Elizabeth");
            Animal Timon = new Tiger("Timon");
            Animal Timothy = new Tiger("Timothy");
            Animal Lionel =  new Lion("Lionel");
            Animal Lily = new Lion("Lily");

            //Collecting all of the animals into an array for the zookeeper to use.
            Animal animals[] = {Caesar, Carlos, Willy, Wilbur, Danny, Danielle, Herby, Harriet, Ezekiel, Elizabeth, Timon, Timothy, Lionel, Lily};

            //Instantiating the zookeeper for the zoo.
            Zookeeper z = new Zookeeper(animals);

            //Performing the zookeeper's daily duties.
            z.wakeAnimals();
            z.rollCall();
            z.feedAnimals();
            z.excerciseAnimals();
            z.shutDown();
    }
}
