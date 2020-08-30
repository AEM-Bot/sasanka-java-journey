package com.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer number) {
        return number % 2 == 0;
    }
}

class EvenNumberUsinConsumer implements Consumer<Integer> {
    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}

class EvenNumbersSquareFunction implements Function<Integer, Integer> {


    @Override
    public Integer apply(Integer integer) {
        return integer * integer;
    }
}

//Predicate Interface --> returns the test (boolean)
public class LambdaBehindScenesRunner {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        integers.add(23);
        integers.add(34);
        integers.add(43);
        integers.add(48);

        //Using lambdas
        //storing functions in variables
        Predicate<Integer> evenPredicate = createEvenPredicate();
        integers.stream()
                .filter(evenPredicate)
                .forEach(e -> System.out.println(e));

        System.out.println("=====Using Consumer for Each=====");

        //Using how lambdas are working
        integers.stream()
                .filter(new EvenNumberPredicate())
                .forEach(new EvenNumberUsinConsumer());


        //Using lambdas map
        integers.stream()
                .filter(createEvenPredicate())
                .map(n -> n * n)
                .forEach(n -> System.out.println(n));

        System.out.println("====Using Functional Interface ==== ");
        //using implementation of Function Interface
        integers.stream()
                .filter(n -> n % 2 == 0)
                .map(new EvenNumbersSquareFunction())
                .forEach(e -> System.out.println(e));

    }

    private static Predicate<Integer> createEvenPredicate() {
        return n -> n % 2 == 0;
    }
}
