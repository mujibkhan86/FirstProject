package com.learn.loop;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Factorial generator\n");
        System.out.print("Please enter a number : ");
        int num1 = input.nextInt();
        //long fact =factorialIterative(num1);
        long fact =factorial(num1);
        System.out.println("Factorial of your number is : " + fact);
    }
    public static long factorial(int num){
        System.out.println("Function called for : " +num);
      if(num == 1){
          return 1;
      }

        return num * factorial(num -1);
    }
    public static long factorialIterative(int num){
      int result =1;
      for(int i =1; i<=num; i++){
         result*= i;
      }
        return result;

    }
}
