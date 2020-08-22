package com.company;

public abstract class AbstractRecipe {

    //algorithm is steps to create a dish here -->>???

    /*
        Prepare, recipe, cleanup --> for cooking

     */

    public void execute() {
        getReady();
        doTheDish();
        cleanup();
    }

    abstract void getReady();

    abstract void doTheDish();

    abstract void cleanup();

}
