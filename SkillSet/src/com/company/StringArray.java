package com.company;

import java.util.Arrays;

public class StringArray {

    String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};

    public String longestString() {
        String longestString = "";
        for (String lgString : daysOfWeek) {
            if (lgString.length() > longestString.length()) {
                longestString = lgString;
            }
        }
        return longestString;
    }

    public String[] weekBackwards() {
        String[] reverseWeekdays = new String[7];
        for (int i = daysOfWeek.length - 1; i >= 0; i--) {
            reverseWeekdays[i] = daysOfWeek[daysOfWeek.length - 1 - i];
        }
        return reverseWeekdays;
    }
}
