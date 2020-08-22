package com.company;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("Honeywell",0.345,"green");
        fan.switchOn();
        fan.setSpeed((byte)5);
        System.out.println(fan);

    }
}
