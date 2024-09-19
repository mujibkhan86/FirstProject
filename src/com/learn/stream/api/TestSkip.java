package com.learn.stream.api;

import java.util.stream.Stream;

public class TestSkip {
    public static void main(String[] args) {
        Stream.of("joet","Amit","robin","abhilash","jay", "jay", "krihsna","Amit")
               // .skip(3) // stateful intermediate operation
                .distinct()  /// stateful intermediate operation
                .forEach(str-> System.out.println(str));
    }
}
