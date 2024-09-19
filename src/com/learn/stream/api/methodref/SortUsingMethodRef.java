package com.learn.stream.api.methodref;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class SortUsingMethodRef {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(8,1, 4, 9, 2, 3, 5, 10, 6, 7);
        Consumer<List<Integer>> sortingLogic = Collections::sort;
        sortingLogic.accept(integerList);
        System.out.println(integerList);

        BiFunction<Integer,Integer,Integer>sumFeature = SortUsingMethodRef::multiply;  // Integer::sum
        Integer sum = sumFeature.apply(10, 10);
        System.out.println("sum is: " + sum);

        BiPredicate<String, String>checkIfTwoStringAreEquals = Objects::equals;
        boolean result = checkIfTwoStringAreEquals.test("hello", "hello");
        System.out.println(result);

        BiFunction<String, String, Boolean>checkIfTwoStringAreEquals1 = Objects::equals;
        boolean result1 = checkIfTwoStringAreEquals.test("hello", "Abc");
        System.out.println(result1);

        Function<Object, Integer>calculateHash = Objects::hashCode;
        int hash = calculateHash.apply(new SortUsingMethodRef());
        System.out.println(hash);
        System.out.println("--------------------------");
        Consumer<String> printLogic = System.out::println;
        printLogic.accept("hello world");
    }

    public static int multiply(int a, int b){
        return a*b;
    }
}
