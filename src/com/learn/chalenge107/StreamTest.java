package com.learn.chalenge107;

import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names = List.of("Prashant","Ravi","Ram","Amit","Rahul");
        names.stream()
                .forEach(name->System.out.println(name));
    }
}
