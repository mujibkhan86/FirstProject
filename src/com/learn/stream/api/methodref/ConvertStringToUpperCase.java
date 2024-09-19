package com.learn.stream.api.methodref;

import java.util.function.*;

public class ConvertStringToUpperCase {
    public static void main(String[] args) {
      /*  String str = "i am learning java8 feature";
       Supplier<String> toUpperCaseFn = str::toUpperCase;
        String result = toUpperCaseFn.get();
        System.out.println( result);*/

       Function<String, String> toUpperCase = String::toUpperCase;  // "hello huma khan" .toUpperCase
        String result = toUpperCase.apply("hello huma khan");
        System.out.println(result);
        System.out.println(toUpperCase.apply("mujib khankkkk"));
    }
}
