package com.learn.operators;

import java.util.Scanner;

class PositiveNegativeZero {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to number checker \n");
   System.out.print("Please enter a number:");
   int number = input.nextInt();
    if(number > 0){
        System.out.println("Your number is positive : " + number);
    } else if ( number == 0 ) {
        System.out.println("Your number is zero :" + number);
    }else{
        System.out.println("Your number is negative: " + number);
    }
  }
}
