package com.learn.stream.api;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class TestStringOf {
    public static void main(String[] args) {
        /*Consumer<Integer> consumer =  new Consumer<Integer>() {
            @Override
            public void accept(Integer integerObj) {
                System.out.println("printing integer: " +integerObj);
            }
        };
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
        integerStream.forEach(consumer);
    }*/

        // using lambda

        Consumer<Integer> consumer;
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8).forEach( integerObj ->System.out.println("printing integer: " + integerObj));
    }
}