package com.company;

public class AbstractRunner {
    public static void main(String[] args) {
        AnimalWithAbstractExample animalWithAbstractExample =
                new AnimalWithAbstractExample();
        //Below is not allowed --> Object initialization is not allowed for
        //abstract classes
        //AbstractExample abstractExample = new AbstractExample();
        animalWithAbstractExample.bark();
    }
}
