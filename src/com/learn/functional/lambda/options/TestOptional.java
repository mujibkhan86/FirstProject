package com.learn.functional.lambda.options;

import java.util.List;
import java.util.Optional;

public class TestOptional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of();
          Optional<Integer> newSum2= numbers.stream()
                   .reduce((a,b)->a+b);
           if(newSum2.isPresent()){
               System.out.println(newSum2.get());
           }else{
               System.out.println("List is empty");
           }
    }
}
