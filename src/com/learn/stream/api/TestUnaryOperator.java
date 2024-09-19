package com.learn.stream.api;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class TestUnaryOperator {
    public static void main(String[] args) {
        Stream.iterate(0, new UnaryOperator<Integer>() {
                                                @Override
                                                public Integer apply(Integer integer) {
                                                    return integer+1;
                                                }
                                            })
                                           //.filter(integer -> integer<20)
                                            .limit(20)
                                            .forEach(integer -> System.out.println(integer));
    }
}
