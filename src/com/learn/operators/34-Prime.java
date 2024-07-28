package com.learn.operators;
import java.util.Scanner;
class Prime {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to Prime World\n");
   System.out.print("Enter a number : ");
   int num = input.nextInt();
   boolean isPrime = isPrimeNumber(num);
   if ( isPrime ){
    System.out.println("Your number is prime: " +num);
   }else{
    System.out.println("Your number is not prime : " +num);
   }
  }
  private static boolean isPrimeNumber(int num){
   int i=2;
   while(i < num){
    if(num % i == 0) {
     return false;
    }
    i++;
   }
   return true;
  }
}
