package com.learn.operators;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Compound Interest Calculator\n\n");
        System.out.print("Please enter your principal amount Rs: ");
        int principal = input.nextInt();
        System.out.print("Now, tell me your rate of interest Rs:");
        float rate= input.nextFloat();
        System.out.print("Now, tell me how many years are borrowing this money");
        float years = input.nextFloat();

        double compoundInterest =  (principal * Math.pow((1+rate/100),years));
        System.out.println("Your compound interest is RS : " +compoundInterest);
    }
}
