package com.company;

public class MotorBikeRunner {

    public static void main(String[] args) {
        MotorBike ducati = new MotorBike(100);
        MotorBike honda = new MotorBike(200);

        ducati.start();
        honda.start();

        ducati.setSpeed(100);
        ducati.increaseSpeed(100);
        ducati.decreaseSpeed(20);
//        int ducatiSpeed = ducati.getSpeed();
//        ducatiSpeed += 100;
//        ducati.setSpeed(ducatiSpeed);
        System.out.println("Ducati Speed is : " + ducati.getSpeed());
        honda.setSpeed(80);
        System.out.println("Honda Speed is : " + honda.getSpeed());

    }
}
