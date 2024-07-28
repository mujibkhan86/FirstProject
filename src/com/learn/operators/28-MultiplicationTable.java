package com.learn.operators;

import java.util.Scanner;

class MultiplicationTable {
  public static void main(String[] args) {


   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to Multiplication World\n");
   System.out.print("Please enter Multiplication name : ");

   int num = input.nextInt();
          printMultiplicationTable(num);
  }
  public static void printMultiplicationTable(int num){
      /*for(int i =1; i<=10; i++){
          System.out.println(num*i);
      }*/

      int i =1;
      while (i<=10){
          System.out.println(num + "X" + i +  " = "+ (num*i));
          i++;
      }
  }
}
