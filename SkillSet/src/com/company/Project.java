package com.company;

public class Project {

    public static void main(String[] args) {
        ComplexAlgorithm algorithm = new DummyAlgorithm();
        //Switch from the dummy algorithm to real algorithm
        algorithm.complexAlgorithm(10, 20);
    }
}
