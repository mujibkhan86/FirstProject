package com.learn.operators;

import java.util.Scanner;

class ReverseArray {
  public static void main(String[] args) {
   System.out.println(" Welcome to reverse Array.");
    int[] newArr = numArray();
    reverseArray(newArr);
   System.out.println("Your reversed array is :");
   display(newArr);
  }

  public static void display(int [] arr){
   int i = 0;
   while (i < arr.length){
    System.out.print(arr[i] + " ");
    i++;
   }
   System.out.println();
  }

  public static void reverseArray(int [] numArr){
   int i = 0;
   while (i < numArr.length/2){
       int swap = numArr[i];
    numArr[i] = numArr[(numArr.length -1) -i];
    numArr[(numArr.length-1) -i] = swap;
    i++;
   }
  }

  public static int[] numArray(){
   Scanner input = new Scanner(System.in);
   System.out.print("Please enter the Number: ");
   int size = input.nextInt();
   int [] newArr = new int[size];
   int i = 0 ;
   while (i < size){
    System.out.print("please enter element "  +(i+1)+ " ");
    newArr[i] = input.nextInt();
    i++;
   }
   return  newArr;
  }
}
