package com.learn.operators;

import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number guessing game\n");
        int num =5;
        int guss;
       do{
           System.out.print("Please guess the number between 0 to 10 :");
           guss = input.nextInt();
       }while (num != guss);
        System.out.println("You have successfully guess the number:");
    }
}
