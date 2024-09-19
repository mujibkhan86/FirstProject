package com.learn.stream.api.methodref;

import java.util.function.BiFunction;

public class TestConcat {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        String result = str1.concat(str2);
        System.out.println(result);
        BiFunction<String, String,String> concatFn =String::concat;// this should be like"mujib".concat("khan")
        String concat = concatFn.apply("mujib", " khan");
        System.out.println(concat);

    }
}
