package com.learn.stream.api.methodref;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortTest {
    public static void main(String[] args) {
        List<Integer> integerList =Arrays.asList(8,9,4,6,2,5,1,7);
        System.out.println("before sorting done : " + integerList);
        /*ISort iSort = (list)->{
            Collections.sort(list);
        };*/
        ISort iSort = Collections::sort;
        iSort.sortArrayList(integerList);
        System.out.println("after sorting done : "+integerList);
    }
}
