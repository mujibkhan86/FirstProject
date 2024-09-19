package com.learn.stream.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestIntegerArray {
    public static void main(String[] args) {
      Integer [] numbers = {1,2,3,4,5,6,7,8,9};

        /*Stream<Integer> streamOfInteger = Arrays.stream(numbers);
        streamOfInteger.filter((integer)->integer > 5)
                .map(number->{
                    switch (number){
                        case 1 : return "One";
                        case 2 : return "Two";
                        case 3 : return "Three";
                        case 4 : return "Four";
                        case 5 : return "five";
                        case 6 : return "Sex";
                        case 7 : return "Seven";
                        case 8 : return "Eight";
                        case 9 : return "Nine";
                    }
                  return "number in not matched";
                })
               .forEach(System.out::println);*/


           // let convert this line by line.

        Stream<Integer> streamOfInteger  =Arrays.stream(numbers);
        Stream<Integer> filterIntegerStream  =streamOfInteger.filter(num->{
            System.out.println("applying filter for number" +num);
                                                    return num >5;});
         Stream<String> mappedStream  =filterIntegerStream.map(number->{
             System.out.println("mapping number : " +number);
                                        switch (number){
                                            case 1 : return "One";
                                            case 2 : return "Two";
                                            case 3 : return "Three";
                                            case 4 : return "Four";
                                            case 5 : return "five";
                                            case 6 : return "Sex";
                                            case 7 : return "Seven";
                                            case 8 : return "Eight";
                                            case 9 : return "Nine";
                                        }
                                        return "number in not matched";
                                    });

        long count= mappedStream.count();
        System.out.println("Count is :" +count);
        //List<String> list = mappedStream.collect(Collectors.toList());
        //System.out.println("printing list : " + list);
      //  mappedStream.forEach(num-> System.out.println(num));







      /*for (Integer num :numbers){
          if(num > 5){
          System.out.println("printing number : " + num);
      }
    }*/
        // using stream api

}
}