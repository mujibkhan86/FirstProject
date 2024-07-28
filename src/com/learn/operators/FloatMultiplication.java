package com.learn.operators;

import java.util.Scanner;

public class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        double first = input.nextInt();
        System.out.print("Enter Second Number : ");
        double second = input.nextInt();
        double mul = first * second;

        System.out.println("Multiplication result is : " +mul);
    }
}
