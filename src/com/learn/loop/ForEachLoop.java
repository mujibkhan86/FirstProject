package com.learn.loop;

import org.w3c.dom.ls.LSOutput;

public class ForEachLoop {
    public static void main(String[] args) {
        String  [] array = new String[]{
         "Ram", "Shyam", "Mohan" ,"Sohan" ,"Sita", "Geeta"
        };
        printArray(array);
        System.out.println("--------------------");
        printArrayForEach(array);
    }

    public static void printArrayForEach(String[] array) {
        for(String name:array){
            System.out.println(name);
        }
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
