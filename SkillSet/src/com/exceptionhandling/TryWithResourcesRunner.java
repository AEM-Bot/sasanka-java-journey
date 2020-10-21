package com.exceptionhandling;

import java.util.Scanner;

public class TryWithResourcesRunner {
    /* finally always executed with exception or
        without exception no matter what
        only in cases where inside the finally
        block has some exceptions
        or jvm crashes (Rare cases)
        can have finally with try --> finally
        or finally with try --> catch --> finally
        last should be Exception
        Never Hide Exceptions
        Do not use it for flow control (if else very expensive)
        Think about user and support team and calling method
        global exception handling
     */

    /*
        automatically adds scanner.close
        making simpler to manage try catch
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int[] numbers = {12, 3, 4, 5};
            int number = numbers[5];
        }
    }
}
