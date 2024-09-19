package com.learn.stream.api.methodref;

import java.util.function.BiFunction;

public class SimpleTest {
    public static void main(String[] args) {

      BiFunction<Integer, Integer,Integer> biFunction = SimpleTest::add;
        int sum = biFunction.apply(10, 10);
        System.out.println("Sum is: " +sum);
    }

    public static int add(int a, int b){
        return a+b;
    }
}
