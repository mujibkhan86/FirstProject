package com.learn.operators;
import java.util.Scanner;
class LCM {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to LCM world\n");
   System.out.print("Please enter first number :");
   int firstNum = input.nextInt();
   System.out.print("Please enter second number :");
   int secondNum = input.nextInt();
   int clmNumber = lcmNumber(firstNum, secondNum);
   System.out.println("LCM of two number is: " + clmNumber);
  }
  public  static int lcmNumber(int firstNum,int secondNum){
    int i = 1;
    // (i <= secondNum){
      while (true){
     int factor = (firstNum * i);
     if ( factor % secondNum == 0 ){
      return factor;
     }
     i++;
    }
  // return  0;  //unreachable
  }
}
