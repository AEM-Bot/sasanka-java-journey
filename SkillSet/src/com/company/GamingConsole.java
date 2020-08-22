package com.company;

/*
    Interface and Abstract Class are completely different
    Just Providing the declaration of GamingConsole here --> Interface
    These implementations will be done by the individual classes
    An Interface can extend another Interface --> extends is possible
    Class Implementing Interface must implement the methods of Interface that extends another Interface
    But if we need to implement any method --> Can be done using
     abstract class but the concrete class extending abstract class still needs to implement the methods
     in the interface
 */
public interface GamingConsole {

    /*
       Below test variable is not allowed in Interfaces
     */
    //int test;

    /*
        Below test is a constant that is allowed in Interface
     */
    int test = 100;

    public void up();

    public void down();

    public void left();

    public void right();

    /*
        This method creation and implementation is introduced in java 8 only
        default method from Interface --> default keyword is a must
     */
    default void print() {
        System.out.println("default");
    }

}
