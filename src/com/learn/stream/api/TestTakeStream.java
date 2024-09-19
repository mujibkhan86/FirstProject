package com.learn.stream.api;

import java.util.stream.Stream;

public class TestTakeStream {
    public static void main(String[] args) {
       /* Stream.of(1,2,3,4,5,6,7,8,9,10)
                .takeWhile(integer ->{
                    System.out.println("filter : applying filter on the number : "+ integer);
                    return integer < 8;})  //takeWhile method
                .map(number->{
                    System.out.println("map : mapping number to number * number " + number);
                    return number *number;
                })
                .forEach(integer -> System.out.println(integer));*/

        Stream.of("joet","robin","abhilash","jay","krihsna")
                .takeWhile(str->str.length() > 3)
                .forEach(str-> System.out.println(str));


    }
}
