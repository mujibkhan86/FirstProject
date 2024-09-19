package com.learn.stream.api.methodref;

import java.util.ArrayList;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestBoxing {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10); //  this is autoboxing
        //internally this will happen
        //arrayList.add(Integer.valueOf(10)); //  this is called boxing
        Stream<Integer> integerStream = Stream.of(1, 3, 4, 6, 8, 9, 10);
        integerStream.forEach(System.out::println);
        IntStream intStream = IntStream.of(1, 3, 5, 6, 7, 8, 8, 9);
        //int sum = intStream.sum();
        //System.out.println(sum);
         OptionalInt min = intStream.min();
         if(min.isPresent()){
             System.out.println(min.getAsInt());
         }



        //intStream.forEach(System.out::println);
    }
}
