package com.learn.stream.api;

import java.util.stream.Stream;

public class TestSortStream {
    public static void main(String[] args) {
                                     /* Stream.of(10,1,4,7,8,2,9,3,5,6)
                                     .sorted()
                                      .forEach(num-> System.out.println(num));*/











           Stream.of("zia","rakesh","joe","abhi")
                   .filter(nameStream->{
                       System.out.println("filter : applying filter of name: " + nameStream);
                       return nameStream.length()>2;

                   })
                   .sorted()
                   .peek(name-> System.out.println("sorting done for name : " + name))
                   .forEach(str-> System.out.println(str));

                }
}
