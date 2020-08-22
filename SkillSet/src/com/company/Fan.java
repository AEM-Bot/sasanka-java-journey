package com.company;

public class Fan {

    //state
    private String make;

    private byte speed; //enums for speed

    private double radius;//typically enums for radius

    private boolean isOn;

    private String color;


    //constructors
//    public Fan(String make, byte speed, double radius, boolean isOn, String color) {
//        this.make = make;
//        this.speed = speed;
//        this.radius = radius;
//        this.isOn = isOn;
//        this.color = color;
//    }

    public Fan(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }


//    public String toString() {
//        return "Fan{" +
//                "make='" + make + '\'' +
//                ", speed=" + speed +
//                ", radius=" + radius +
//                ", isOn=" + isOn +
//                ", color='" + color + '\'' +
//                '}';
//    }

//    public void isOn(boolean isOn) {
//        this.isOn = isOn;
//    }

    public void switchOn() {
        this.isOn = true;
    }

    public void switchOff() {
        this.isOn = false;
        setSpeed((byte)0);
    }

    public void setSpeed(byte speed) {
        this.speed = speed;
    }

    //typically tostring is the last method
    public String toString() {
        return String.format("make - %s, radius - %f, color - %s, isOn - %b,speed - %d",
                make, radius, color, isOn, speed);
    }
}
