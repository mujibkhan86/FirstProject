package com.learn.arrays;

import java.util.Scanner;

public class ArrayUtils {
    public static int[] numArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int [] num = {3, 2, 5, 7, 8, 9};
       // int[] numbs = new int[num];
        int i = 0;
        int i1 =0;
        while (i < num.length) {
          // num[i] = i;
            i++;
        }
        return num;
    }

}
