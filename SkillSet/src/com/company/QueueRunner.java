package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {

//Ascending order
//    @Override
//    public int compare(String value1, String value2) {
//        return Integer.compare(value1.length(), value2.length());
//    }
    //Descending order
    @Override
    public int compare(String value1, String value2) {
        return Integer.compare(value2.length(), value1.length());
    }
}


public class QueueRunner {


    public static void main(String[] args) {

        //Overriding the existing natural order of priority Queue by using comparator
        Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());

        queue.add("Apple");
        queue.add("Zebra");
        queue.add("Monkey");
        queue.add("Cat");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());


    }
}
