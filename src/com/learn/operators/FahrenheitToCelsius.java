package com.learn.operators;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fahrenheit Celsius convertor\n");
        System.out.print("Enter your temp in F: ");
        float fah = input.nextFloat();
        float cel = (fah -32) * 5.0f/9.0f;

        System.out.println("Your temperature Celsius is : " + cel + "  c");
    }
}
