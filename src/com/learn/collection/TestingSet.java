package com.learn.collection;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Prashant"));
        System.out.println(names.add("Sachet"));
        System.out.println(names.add("KG Coding"));
        Utility.print(names);
    }
}
