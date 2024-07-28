package com.learn.operators;

import java.util.Scanner;

public class SwapValue {
    public static void main(String[] args) {
        System.out.println("Welcome to Swapping Station \n\n");
        Scanner input =new Scanner(System.in);
        System.out.print("Enter first number of A: ");
        int a=input.nextInt();
        System.out.print("Enter Second number of B: ");
        int b = input.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("a value after swapping: " + a);
        System.out.println("b value after swapping: " + b);

    }
}
