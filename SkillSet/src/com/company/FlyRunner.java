package com.company;

public class FlyRunner {
    public static void main(String[] args) {
        Flyable[] flyingObjects = {new Bird(), new Aeroplane()};

        for (Flyable flyingObject : flyingObjects) {
            flyingObject.fly();
        }

        AnimalAbstractExercise[] animals = {new Cat(), new DogExercise()};

        for (AnimalAbstractExercise animal:animals){
            animal.bark();
        }
    }
}
