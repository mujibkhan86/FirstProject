package com.learn.functional.lambda.methodrefernce;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 4, 2, 5, 6, 3);
        numbers.stream()
                .filter(num -> num % 2 == 1)
                .forEach(System.out::println);

        int newSum2 =numbers.stream()
              .reduce(0, (a,b)-> a+b);
        System.out.printf("\n Sum using reduce is :%d",newSum2);

        int newSum3 =numbers.stream()
                .reduce(0, Integer::sum);
        System.out.printf("\n Sum using reduce is :%d",newSum3);

//        int sum = 0;
//        for (Integer number : numbers) {
//            sum += number;
//        }
//        System.out.println(sum);
//        System.out.println("Using Stream API");
//        int newSum =numbers.stream()
//                .reduce(0, new BinaryOperator<Integer>() {
//                    @Override
//                    public Integer apply(Integer integer, Integer integer2) {
//                        return integer +integer2;
//                    }
//                });
//
//        System.out.printf("\n Sum using reduce is :%d",newSum);
//
//        int newSum2 =numbers.stream()
//                .reduce(0, (a,b)-> a+b);
//        System.out.printf("\n Sum using reduce is :%d",newSum2);
//
//        // find max
//        int maxNum =numbers.stream()
//                .reduce(Integer.MIN_VALUE, (a,b)-> a >b ? a :b);
//        System.out.printf("\n Max  is :%d",maxNum);
//
//        // find min
//        int minNum =numbers.stream()
//                .reduce(Integer.MAX_VALUE, (a,b)-> a <b ? a :b);
//        System.out.printf("\n Min  is :%d",minNum);
//    }
    }
}