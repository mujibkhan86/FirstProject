package com.learn.stream.api.methodref;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestMap {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,2,5,7,8,9,3,4,1);
        integerList.stream()
                .filter(f->f > 5)
                .sorted()
                .forEach(System.out::println);

    }
}
