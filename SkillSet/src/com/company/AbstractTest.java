package com.company;

public abstract class AbstractTest {

    private int stepCount; //variables allowed --> In interface these are called constants

    abstract void steps();

    public int getStepCount(){ //non-abstract method
        return stepCount;
    }

}
