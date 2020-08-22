package com.company;

import java.util.Scanner;

public class MenuRnner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //to get user input from console
        System.out.print("Enter Number1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter Number2: ");
        int number2 = scanner.nextInt();
//        System.out.println(number1);
//        System.out.println(number2);

        System.out.println("1-Add");
        System.out.println("2-Subtract");
        System.out.println("3-Divide");
        System.out.println("4-Multiply");
        System.out.print("Choose Operation : ");
        int operation = scanner.nextInt();

        performOperationUsingNestedIfElse(number1, number2, operation);
        PerformOperationUsingSwitchStatement(number1, number2, operation);

    }

    private static void PerformOperationUsingSwitchStatement(int number1, int number2, int operation) {
        switch (operation) {
            case 1:
                System.out.println("Result is - " + (number1 + number2));
                break;
            case 2:
                System.out.println("Result is - " + (number1 - number2));
                break;
            case 3:
                System.out.println("Result is - " + (number1 / number2));
                break;
            case 4:
                System.out.println("Result Using Switch is - " + (number1 * number2));
                break;
            default:
                System.out.println("Invalid Operation");
                break;
        }
    }

    private static void performOperationUsingNestedIfElse(int number1, int number2, int operation) {
        if (operation == 1) {
            System.out.println("Result is - " + (number1 + number2));
        } else if (operation == 2) {
            System.out.println("Result is - " + (number1 - number2));
        } else if (operation == 3) {
            System.out.println("Result is - " + (number1 / number2));
        } else if (operation == 4) {
            System.out.println("Result is IF ELSE IS- " + (number1 * number2));
        } else {
            System.out.println("Invalid Operation... Please select between 1 to 4 Operations");
        }
    }


}
