package com.company;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>();

        System.out.println(queue.poll());

        System.out.println(queue.offer("Apple"));

        System.out.println(queue);


    }
}
