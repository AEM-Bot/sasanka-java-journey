package com.company;

/*
    Usecase of Where to Use Abstract Class
 */
public class Recipe1 extends AbstractRecipe {


    @Override
    void getReady() {
        System.out.println("Get The Ingredients");

    }

    @Override
    void doTheDish() {
        System.out.println("Prepare/Start the Dish");

    }

    @Override
    void cleanup() {
        System.out.println("Clean Utensils");

    }
}
