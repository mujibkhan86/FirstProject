package com.learn.stream.api.methodref;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class ListAddTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

       /* BiConsumer<ArrayList<Integer>,Integer> addInt = ArrayList::add;
        addInt.accept(arrayList,10);
        addInt.accept(arrayList,11);
        addInt.accept(arrayList,12);
        addInt.accept(arrayList,13);
        System.out.println(arrayList);*/

        BiFunction<ArrayList<Integer>,Integer,Boolean> biFunction = ArrayList::add;
        Boolean isAdded = biFunction.apply(arrayList, 10);
        System.out.println(isAdded);
        biFunction.apply(arrayList,11);
        biFunction.apply(arrayList,12);
        biFunction.apply(arrayList,13);
        System.out.println(arrayList);
    }
}
