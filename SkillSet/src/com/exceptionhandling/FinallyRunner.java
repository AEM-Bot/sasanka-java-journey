package com.exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {
    /* finally always executed with exception or
        without exception no matter what
        only in cases where inside the finally
        block has some exceptions
        or jvm crashes (Rare cases)
        can have finally with try --> finally
        or finally with try --> catch --> finally
     */

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            int[] numbers = {12, 3, 4, 5};
            int number = numbers[5];
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Before Scanner Close");
            if (scanner != null) {
                scanner.close();
            }
        }
        System.out.println("Just before closing out main");
    }
}
