package com.learn.operators;
import java.util.Scanner;
class FactorialNumber {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to Factorial World");
      System.out.print("Please enter your Number: ");
   int num = input.nextInt();
           long factorialNumber =factorialNumber(num);
   System.out.println("Factorial number is :  " + num+ " is " + factorialNumber);
  }
  public static long factorialNumber(int num){
      if(num< 2){
          return 1;
      }
   int i =2;
   long fact= 1;
   while(i <= num){
    fact*=  i;//(i*num);
    i++;
   }
   return fact;
  }
}
