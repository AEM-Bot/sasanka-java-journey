package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

    /*
        List<String> words = List.of("Apple") --> JDK 9
        List is immutable --> using List.of
        In order to use it as immutable --> ArrayList and LinkedList and Vector etc
     */

    /*
        Below is using ArrayList But with JDK 9 above is used super easy to work
        with lists
     */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Ball");
        arrayList.add("Cat");
//        System.out.println(arrayList);
//        System.out.println(arrayList.size());
//        System.out.println(arrayList.get(0));
        arrayList.add("Dog");
        System.out.println(arrayList);
        arrayList.add("Dog");
        System.out.println(arrayList);
        //ArrayList allows duplicate elements --Dog

        ArrayList<String> newArrayList = new ArrayList<>();
        newArrayList.add("Hello");
        newArrayList.addAll(arrayList);
        System.out.println(newArrayList);

        newArrayList.set(5, "Elephant");
        System.out.println(newArrayList);

        newArrayList.remove("Elephant");
        System.out.println(newArrayList);

        newArrayList.remove(4);
        System.out.println(newArrayList);

        /*
            Iterate through ArrayList
            Typically using for and enhanced for loop
            Iterator is new
            three methods to iterate based on use case
         */

        /*
            This is something that I have to improve on --> Iterator Interface
         */
        Iterator iterator = newArrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

        //this iterator is easy to match an element
        Iterator myIterator = newArrayList.iterator();
        while (myIterator.hasNext()) {
            if (myIterator.next().equals("Cat")) {
                System.out.println("Found Cat in the Array List");
            }
        }

        //this iterator is easy to match a character pattern or string match inside the element
        for (String word : newArrayList) {
            if (word.endsWith("at")) {
                System.out.println(word);
            }
        }
        System.out.println(newArrayList);

        //below fails --> not recommended to remove the using for loop --> use Iterator instead
//        for (String words:arrayList){
//            if (words.endsWith("at")){
//                arrayList.remove(words);
//            }
//        }
//        System.out.println(arrayList);

        Iterator<String> removeIterator = newArrayList.iterator();
        while (removeIterator.hasNext()) {
            if (removeIterator.next().endsWith("at")) {
                removeIterator.remove();
            }
        }
        System.out.println(newArrayList);

        //Auto Boxing
        //To use specific types like Integer String etc use Generics
        ArrayList list = new ArrayList();
        list.add("A");
        list.add('B');
        list.add(1);
        list.add(1.0);
        System.out.println(list);


    }
}
