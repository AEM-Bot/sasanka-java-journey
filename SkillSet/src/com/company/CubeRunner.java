package com.company;

import java.util.Scanner;

//Reference Types --Default from Java --> String Wrapper Classes, LocalDate and LocalDateTime
//BigDecimal etc...

public class CubeRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        do {

            System.out.print("Enter a number");
            number = scanner.nextInt();
            if (number > 0) {
                System.out.println("Cube is " + (number * number * number));
            }

        } while (number > 0);
        System.out.println("Thank You! Have Fun!");
    }
}


// Heap and Stack Memory in Java --> All objects will be stored in heap memory --Globally Shared
/*
    Primitive values will always stored in stack int i =5;
    Animal class --> Animal dog = new Animal(12); Animal(12) --> Stored in heap
    but dog is stored in Stack Memory
    Animal nothing;
    nothing = dog
    Reference means storing the value as memory location rather than direct value
    so if memory values changes reference values changes

    dog == nothing --> checks for the memory location where they are stored in heap
    for example

    Animal dog = new Animal(12);
    Animal nothing = dog;

    dog == nothing --> true --> pointing to same memory location

      Stack                         Heap
    A i -- 5                  1A -->Animal(12)
    B dog -- 1A
    In dog Value is
    stored as reference
    nothing --> null
    nothing --> 1A
 */
