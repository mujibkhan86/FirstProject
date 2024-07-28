package com.learn.operators;

import java.util.Scanner;

class AbsoluteTernary {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to Absolute value\n");
   System.out.print("Please enter a number : ");
   int num = input.nextInt();
   int result = num >= 0 ? num : -num;
   System.out.println("Absolute value is : " + result);
  }
}
