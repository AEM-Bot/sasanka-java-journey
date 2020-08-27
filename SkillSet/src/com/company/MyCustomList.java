package com.company;

import java.util.ArrayList;

//public class MyCustomList {
//    //this array is tied up to String only --> Problem that solves by using Generics
//
//    ArrayList<String> list = new ArrayList<>();
//    public void addElement(String element){
//        list.add(element);
//    }
//    public void removeElement(String element){
//        list.remove(element);
//    }
//}
//}

//extends Number --> Restrict Specific Types
public class MyCustomList<T> {

    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element) {
        list.add(element);
    }

    public void removeElement(T element) {
        list.remove(element);
    }

    public T get(int elementIndex) {
        return list.get(elementIndex);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}


