package com.learn.chalenge108;

import java.util.List;

public class StringFilterAndConcatenation {
    public static void main(String[] args) {
        List<String> strs = List.of("Prashant Jain", "Raja", "hello world", "is teaching java"
        ,"on KG Coding","Best channel for Java programming","Mariya Khan", "Huma Khan", "I need to learn Java",
                "Without java I can not do Any thing","Need to learn Basic concept of java",
                "Spring is a framework","Sql is a RDMS","MicroService");
              String result = strs.stream()
                       .filter(str->str.length()>10)
                       .reduce("",(a,b)->a + " " +b);
        System.out.println(result);
    }
}
