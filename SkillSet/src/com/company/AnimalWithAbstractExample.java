package com.company;


/*
    In order to extend the Abstract Class the Child/sub class
    must override(implement methods from the Super
    Class
 */
public class AnimalWithAbstractExample extends AbstractExample {


    @Override
    public void bark() {
        System.out.println("BARK ABSTRACT");
    }
}
