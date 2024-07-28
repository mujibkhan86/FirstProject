package com.learn.operators;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Frequency {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,4,6,8,4,1,7,8,1);
        System.out.println(Collections.frequency(integerList, 1));
        System.out.println(Collections.frequency(integerList, 7));
        System.out.println(Collections.frequency(integerList, 8));


    }
}
