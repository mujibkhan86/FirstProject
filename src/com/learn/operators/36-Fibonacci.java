package com.learn.operators;

import java.util.Scanner;

class Fibonacci {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to Fibonacci series\n");
   System.out.print("Please enter the number up to which series has to be printed :");
   int num = input.nextInt();
   System.out.println("Here is the fibonacci Series");
   printFibonacci(num);
  }
  
  private static void  printFibonacci(int num){
   if(num < 0)return;
   System.out.print("0 ");
   if(num == 0) return;
   System.out.print("1 ");
   int firstNum = 0, secondNum =1;
   while (firstNum + secondNum <= num){
    int third = firstNum + secondNum;
       System.out.print(third + " ");
       firstNum = secondNum;
       secondNum = third;
   }
  }
}
