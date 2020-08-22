package com.company;

public class MotorBike {

    //no argument constructor
    public MotorBike(){
        this(5);
    }
    //constructor wont have any return type and exactly same as Class Name
    public MotorBike(int speed) {
        this.speed = speed;
    }

    //state -- encapsulation state should be through methods only not directly with state
    private int speed;

    public void setSpeed(int speed) {
        if (speed > 0)
        this.speed = speed; //setting global variable to local variable
    }

    public int getSpeed() {
        return speed;
    }

    //behavior
    void start() {
        System.out.println("Bike Started");
    }
    public void increaseSpeed(int speedIncrease){
       setSpeed(this.speed + speedIncrease);
    }

    public void decreaseSpeed(int decreaseSpeed){
        setSpeed(this.speed - decreaseSpeed);
    }

}
