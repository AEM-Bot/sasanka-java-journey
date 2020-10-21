package com.exceptionhandling;

/*
    Exceptions occur due to either good or bad programming
    Example --> File not found etc..
    Two Types of Exceptions will occur --> Checked exceptions
    and Unchecked exceptions
    best way to catch exceptions is to meet the expectations
    with exception handling
    two keys:
    1. Friendly message to end user --> Next Steps to be done for the
    end user
    2. Enough Information to Debug the problem --> Stack Trace,
    in which line it cause the exception
 */

/*
    Null Pointer Exception is the most common exception that happens
    in programming
    Stacktrace is the flow of where the exception is happening
    error and exceptions are not the same....

 */

public class ExceptionHandlingConcept {

    public static void main(String[] args) throws Exception{

        method1();
        System.out.println("Main Ended");
        /*
            will not be executed --> Program crashes without proper
            exception handling
         */
    }

    private static void method1() {
        method2();
        System.out.println("Method1 Ended"); //will not be executed
    }

    private static void method2() {
        String str = null;
        str.length();
        System.out.println("Method2 Ended");//will not be executed
    }

}
