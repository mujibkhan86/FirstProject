package com.learn.ternary;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checker\n");
        System.out.print("Please enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Now, enter the second number : ");
        int num2 = input.nextInt();
        /*int greaterNumber;
        if(num1 > num2){
           greaterNumber = num1;
           // System.out.println(num1 + "is the greatest number");
        }else{
          //  System.out.println(num2 + "is the greatest number");
            greaterNumber = num2;
        }*/
        int greaterNumber = num1 > num2 ? num1 : num2;
        System.out.println(greaterNumber + " is the greatest number");
    }
}
