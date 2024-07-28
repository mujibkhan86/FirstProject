package com.learn.operators;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base in cms:");
        double base =input.nextDouble();
        System.out.print("Enter weight in cms :");

        double height = input.nextDouble();
        //double area = 0.5 *base*height;
        double area = (base*height)/2;
        System.out.println("The area of your triangle is: " + area + " cm");
    }
}
