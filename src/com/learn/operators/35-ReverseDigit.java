package com.learn.operators;

import java.util.Scanner;

class ReverseDigit {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to Reverse Digit\n");
   System.out.print("Please enter digit: ");
   long num = input.nextLong();
     long reversDigit = reverseDigit(num);
   System.out.println("Reverse number is : " +reversDigit);
  }
  public static long reverseDigit(long num){
   long newNum = 0;
    while (num > 0){
     long digit = num % 10;
      newNum = newNum * 10 +digit;
      num/= 10;
    }
   return newNum;
  }
}
