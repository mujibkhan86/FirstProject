package com.learn.operators;

import java.util.Scanner;

class PrimeFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to prime number checker\n");
        System.out.print("Please enter the Number:");
        int num = input.nextInt();
        boolean isPrime =isPrime(num);
        System.out.println("your number is: " +
                (isPrime(num) ? "Prime": "Not Prime"));

    }
    public static boolean isPrime(int num){
        for(int i = 2; i < num ; i++){
          if(num % i == 0){
              return  false;
          }
        }
        return true;
    }
}
