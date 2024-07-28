package com.learn.operators;

import java.util.Scanner;

class MaxMinArray {
  public static void main(String[] args) {
   System.out.println("Welcome to Max and Min Array.");
   int[] num = inputArray();

   int max = max(num);
   int min = min(num);
      System.out.println("Max of the Array is : " +max);
      System.out.println("Min of the Array is : " +min);
  }
    private static int max(int[] num) {
      if(num.length == 0){
          return Integer.MIN_VALUE;
      }
      int max = num[0];
      int i = 1;
      while (i < num.length){
          if(max < num[i]){
              max = num[i];
          }
          i++;
      }
      return max;
    }

    private static int min(int[] num) {
         int min = Integer.MAX_VALUE;
         int i =0 ;
         while (i < num.length){
             if ( min >num.length ){
                 min = num[i];
             }
             i++;
         }
        return min;
    }

    public static int [] inputArray(){
   Scanner input = new Scanner(System.in);
      System.out.print("Please enter the number :");
      int size = input.nextInt();
      int [] numbers = new int [size];
       int i = 0;
       while (i < size){
           System.out.print("Please enter array elements " + (i+1) + " : ");
            numbers[i] = input.nextInt();
           i++;
       }
      return  numbers;
  }
}
