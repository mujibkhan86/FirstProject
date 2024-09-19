package com.learn.stream.api;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        /*Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "hello stream !!supplier";
            }
        };
        Consumer<String> consume = new Consumer<String>() {
            @Override
            public void accept(String str) {
                System.out.println("printing the string :" +str);
            }
        };

        Stream<String> streamOfString = Stream.generate(supplier);
        streamOfString.forEach(consume);
    }*/

    // converting to lambda
        Stream.generate(()->"hello stream !!supplier")
                .forEach(str->System.out.println("printing the string :" +str));
    }

}
