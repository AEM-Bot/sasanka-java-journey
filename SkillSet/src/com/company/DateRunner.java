package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateRunner {
    public static void main(String[] args) {
        //JODA Time Framework for Java 8 API

        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDateTime newTime = LocalDateTime.now();
        System.out.println(newTime);

        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);

        LocalDate today = LocalDate.now();

        System.out.println(today.getYear());



        LocalDate yesterday = LocalDate.of(2020,8,3);
        System.out.println(yesterday);
    }
}
