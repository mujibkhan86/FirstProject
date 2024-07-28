package com.learn.operators;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Perimeter Calculator:");
        System.out.print("Please Enter all 4 sides in cms:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();

        System.out.println("Perimeter of your rectangle " +
                " is :" +(a+b+c+d) + "cm");
    }
}
