package com.learn.arrays;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        //int size = sc.nextInt();
       // int [] numbers = new int[size];
        int [] numbers ={1,4,5,6,7,8};
        // input
        /*for (int i = 0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }*/
        // taken x element to search in array
        //int x = sc.nextInt();
        // out put
        for (int i =0; i<numbers.length; i++){
            if ( numbers[i] == 6){
                System.out.println("element find index is : " + i);
            }
        }
    }
}
