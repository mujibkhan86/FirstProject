package com.learn.operators;

import java.util.Arrays;
import java.util.Scanner;

class IsSortedArray {
  public static void main(String[] args) {
   System.out.println("Welcome to Array Sorting checkPosts");
     int [] numArray = numArray();
      boolean isInc = isIncreasing(numArray);
      boolean isDec = isDecreasing(numArray);
      if ( isInc || isDec ){
       System.out.println("Your array is sorted :" );
      }else {
       System.out.println("Your array is not sorted :");
      }
  }

  /**
   * to check array is increasing or not
   */
  public static boolean isIncreasing(int [] numArray){
     int i =1;
     while (i < numArray.length){
         if(numArray[i] < numArray[i-1]){
             return false;
         }
         i++;
     }

   return true;
  }

 /**
  * to check array is decreasing or not
  */
 public static boolean isDecreasing(int [] numArray){
   int i =1;
   while (i < numArray.length){
       if(numArray[i] > numArray[i-1]){
           return  false;
       }
       i++;
   }
  return true;
 }

  public static int[] numArray(){
   Scanner input = new Scanner(System.in);
   System.out.print("Please enter the number :");
   int size = input.nextInt();
    int [] numArray = new int[size];
    int i = 0;
    while (i < size){
     System.out.print("Please enter element no " +(i+1) + " :");
     numArray[i] = input.nextInt();
     i++;
    }


    return  numArray;
  }
}
