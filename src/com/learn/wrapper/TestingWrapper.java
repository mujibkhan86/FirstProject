package com.learn.wrapper;

public class TestingWrapper {
    public static void main(String[] args) {
        // auto boxing
        Integer first = 55; //Integer.valueOf("55");
        System.out.println(first);
        //unboxing
        int second = first;
        System.out.println(second);
    }
}
