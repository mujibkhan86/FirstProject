package com.learn.chalenge113;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestingDistinct {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,2,5,6,5,4,3);
        List<Integer> distinctNumbers =numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Before Distinct number: " + numbers);
        System.out.println("Distinct number is :" + distinctNumbers);
    }
}
