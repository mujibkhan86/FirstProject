package com.learn.operators;

import java.util.Scanner;

class AgeCheck {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to Age check Calculator\n");
   System.out.print("Please enter age");
   int age = input.nextInt();
   if(age >= 65){
    System.out.println("you are a Senior Citizen");
   } else if (age >= 20 ) {
    System.out.println("you are a Adult");
   } else if ( age >=13 ) {
    System.out.println("you are a Teen");
   }else{
    System.out.println("you are a Child");
   }
  }
}
