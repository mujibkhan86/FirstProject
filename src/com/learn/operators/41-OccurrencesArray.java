package com.learn.operators;

import java.util.Scanner;

class OccurrencesArray {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to Occurrences Array:");
     int [] numArr = numArray();
   System.out.print("Please enter the no that you want to find : ");
   int num = input.nextInt();
   int noOfOccurrences = noOfOccurrences(numArr, num);
   System.out.print("Your element was found " +noOfOccurrences + " times in the array");
  }

  public static int noOfOccurrences(int [] numArr, int num){
   int occ = 0 ;
   int i = 0;
   while (i < numArr.length){
    if(numArr[i] == num){
     occ++;
    }
    i++;
   }
   return occ;
  }

  public static int [] numArray(){
   Scanner input = new Scanner(System.in);
   System.out.print("Please enter the number : ");
   int size = input.nextInt();
   int [] numbers = new int[size];
   int i = 0;
   while (i < size){
    System.out.print("Please enter the array elements " + (i+1) + ": ");
     numbers[i] =input.nextInt();
    i++;
   }
   return numbers;
  }
}
