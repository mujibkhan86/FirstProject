package com.learn.arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        /*int [] marks = new int[3];
        marks[0] = 97;  //physics
        marks[1] = 98; // chemistry
        marks[2] = 98;  // english
        //System.out.println(marks[1]);
        for (int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }*/
        /*
         Take an array as input from the user.Search for a given number X and print the
         index at which it occurs.
         */
        // This is called Liner Search
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int [size];
        // input
        for (int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        // out put
        for (int i = 0; i<numbers.length; i++){
            if(numbers[i] == x){
                System.out.println("X found at index: " + i);
            }

        }
    }
}
