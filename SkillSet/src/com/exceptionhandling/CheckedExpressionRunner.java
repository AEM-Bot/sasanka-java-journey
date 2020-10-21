package com.exceptionhandling;

/*
    Exception Hierarchy
    Error, Exception extends Throwable
    Prevent Errors but can't handle them --> jvm stackoverflow etc
    Exception can be handled
    Two Exceptions --> Checked Exceptions & Unchecked Exceptions
    1. RuntimeException under Exceptions but not Checked Exceptions --> No need to handle if required
    2. InterruptedException Under Exceptions--> Checked Exception --> Must be handled
    either using throws or try catch --> Risky Exceptions (Checked Exceptions)

 */

public class CheckedExpressionRunner {

    /*
        Forced to handle the exception
        with either try catch
        or throws

     */
//    public static void main(String[] args) throws InterruptedException {
//        Thread.sleep(2000);
//    }
    public static void main(String[] args) {
//        try {
//            someOtherMethod();
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        someOtherMethod2(); // main says don't care even if we are using throws
        // someOtherMethod();//main says to handle the exception --> force to handle the exception

    }

    private static void someOtherMethod2() throws RuntimeException {

    }


    //it is like throwing risky things throws
    private static void someOtherMethod() throws InterruptedException {
        Thread.sleep(2000); //Thread.sleep forces to handle exception or just throw exception
    }
}
