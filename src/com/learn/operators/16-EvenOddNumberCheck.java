package com.learn.operators;

import java.util.Scanner;

class EvenOddNumberCheck {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to even odd calculator\n");
   System.out.print("Please enter your Number: ");
   int num = input.nextInt();

   if(num % 2 == 0){
    System.out.println("Even number is : "+num) ;
   }else{
    System.out.println("Odd number is : " + num);
   }
  }
}
