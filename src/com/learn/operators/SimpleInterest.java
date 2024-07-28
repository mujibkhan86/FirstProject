package com.learn.operators;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to SimpleInterest Calculator:\n");
        System.out.print("Please enter your principal amount Rs: ");
        int principal = input.nextInt();
        System.out.print("Now, tell me your rate of interest Rs:");
        float rate= input.nextFloat();
        System.out.print("Now, tell me how many years are borrowing this money");
        float years = input.nextFloat();

        float interest = (principal*rate*years)/100;
        System.out.println("\n\n your simple interest is RS: " +interest);
    }
}
