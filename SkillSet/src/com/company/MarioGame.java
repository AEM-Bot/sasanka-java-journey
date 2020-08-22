package com.company;

/*
    MarioGame is Implementing GamingConsole Interface
 */
public class MarioGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("JUMP");

    }

    @Override
    public void down() {
        System.out.println("Goes into a hole ");

    }

    @Override
    public void left() {

    }

    @Override
    public void right() {
        System.out.println("Forward");
    }
}
