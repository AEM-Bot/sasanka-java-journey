package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

import static java.lang.System.out;

import static java.util.Collections.sort;


//static and normal imports
public class ImportsRunner {

    public static void main(String[] args) {
        //string is in package of java.lang --> default import
        String str = "";

        //java.math
        BigDecimal db = null;

        //Never use * in java imports

        System.out.println("Imports");

        out.println("Static Imports");

        Collections.sort(new ArrayList<String>());

        sort(new ArrayList<Integer>());

    }
}
