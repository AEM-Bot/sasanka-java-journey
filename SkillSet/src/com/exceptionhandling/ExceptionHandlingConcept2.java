package com.exceptionhandling;

public class ExceptionHandlingConcept2 {

    public static void main(String[] args) {
        method1();
        System.out.println("Main Ended");
    }

    private static void method1() {
        method2();
        System.out.println("Method1 Ended");
    }

    /*
        Handling the exception at method2 without
         crashing the problem
         Exception is super class for NullPointerException
         can have multiple catch blocks for handling exceptions
     */
    private static void method2() {
        try {
            //String str = null;
            //str.length();
            int[] array = {1, 2};
            int number = array[3];
            System.out.println("Method2 Ended");
        } catch (NullPointerException ex) {
            System.out.println("Matched Null Pointer Exception");
        } catch (ArrayIndexOutOfBoundsException ar) {
            System.out.println("Matched ArrayIndexOutOfBoundsException");
            ar.printStackTrace();
        } catch (Exception ex) {
            System.out.println("Matched Exception");
            ex.printStackTrace();
        }

    }

}
