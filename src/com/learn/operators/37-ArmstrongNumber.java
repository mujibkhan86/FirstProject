package com.learn.operators;

import java.util.Scanner;

class ArmstrongNumber {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to Armstrong Number\n");
   System.out.print("Please enter a Number: ");
   int num = input.nextInt();
   boolean isArmstrong = isArmstrong(num);
   System.out.println(isArmstrong);
   if(isArmstrong){
    System.out.println("Your Number is Armstrong :" + num);
   }else{
    System.out.println("Your Number is not a Armstrong: " + num);
   }
  }
  public static boolean isArmstrong(int num){
   int noOfDigits = noOfDigits(num);
   int numCopy= num;
   System.out.println("No of Digits : " + noOfDigits);
   int finalNumber = 0;
   while (num > 0){
    int lastDigit = num % 10;
    finalNumber += power(lastDigit, noOfDigits);
    num /= 10;
   }
   System.out.println("Final number is: " +finalNumber);
   return  finalNumber == numCopy;
  }
  /**
   * This method is used to return the number of power
   */
  public static int power(int num1, int num2){
    int result = 1;
    int i =0;
    while (i < num2){
     result *= num1;
     i++;
    }
   System.out.println("Power of " + num1+ " is " + result );
    return result;
  }
/**
 *
 this method is used to return the digit of given number
 */
  public static int noOfDigits(int num){
    int digit = 0;
  while (num > 0){
     digit ++;
     num /= 10;
  }
   return digit;
  }
}
