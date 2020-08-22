package com.company;

/*
    Abstract Class
    No need to specify implementation of method
    methods and class should have keyword --> abstract
    Abstract classes can not be created for instances/objects
    Ex: AbstractExample abstractExample = new AbstractExample(); --> Not allowed
    We can create Sub Classes by extending from the Abstract class
    and implement concrete methods in sub classes

    Abstract Class can extend another Abstract Class
    Fields/Variables definition and concrete methods are also allowed in Abstract Class
    --Refer to AbstractTest Class
    can have non abstract methods in abstract class --> which means abstract class
    can also have implementation of methods
 */

/*
    Where to Use Abstract Class -> Abstract Recipe and Recipe1 Classes (Refer)
    Gives high level algorithm and the implementation will be done in sub classes

 */
public abstract class AbstractExample {

    /*
        Abstract method bark method implementation
        is done by the subclass
     */
    public abstract void bark();

}
