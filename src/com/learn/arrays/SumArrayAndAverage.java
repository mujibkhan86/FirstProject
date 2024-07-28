package com.learn.arrays;

import static java.lang.Long.sum;

public class SumArrayAndAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to sum and Average Array :");
         int [] num =ArrayUtils.numArray();
        System.out.println(num.length);
         long sum = sum(num);
        System.out.println("Sum of array is : " +sum);
        double avg = average(num);
        System.out.println("Average of array is : " +avg);
    }

    private static long sum(int[] num) {
         int sum =0;
         int i =0;
         while (i< num.length){
             sum += num[i];
             i++;
         }
        return sum;
    }

    public static double average(int [] num){
       double avg = sum(num);
       return  avg/num.length;
    }
}
