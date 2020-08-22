package com.company;

import java.util.Scanner;

public class SwitchExerciseRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Day Number: ");
        int dayNumber = scanner.nextInt();


        System.out.print("Enter Month Number: ");
        int monthNumber = scanner.nextInt();

        System.out.println("Return WeekDay Method with Boolean: " +
                isWeekDay(dayNumber));

        System.out.println("Determine Name of Month Method: " +
                determineNameOfMonth(monthNumber));

        System.out.println("Determine Name Of Day Method: " +
                determineNameOfDay(dayNumber));


    }

    private static String determineNameOfDay(int dayNumber) {
        //never have many return statements in any code as above--just one return must be there
        String day;
        switch (dayNumber) {
            case 0:
                day = "Sunday";
                break;
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            default:
                day = "Invalid Day";
                break;
        }
        return day;
    }

    private static String determineNameOfMonth(int monthNumber) {
        String month;
        switch (monthNumber) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "Invalid Month";
                break;
        }
        return month;
    }

    private static boolean isWeekDay(int dayNumber) {
        boolean isWeeDay;
        switch (dayNumber) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                isWeeDay = true;
                break;
            default:
                isWeeDay = false;
                break;
        }
        return isWeeDay;
    }
}