package com.learn.operators;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Arithmetic calculator\n");
        System.out.print("Enter first Number ");
        int n1 = input.nextInt();
        System.out.print("Enter second Number ");
        int n2 = input.nextInt();

        int sum =n1+n2;
        int sub = n1-n2;
        int mul = n1*n2;
        int div = n1/n2;
        int mod = n1%n2;

        System.out.println("Sum is: " +sum);
        System.out.println("substation is: " +sub);
        System.out.println("multiplication is: " +mul);
        System.out.println("division is: " +div);
        System.out.println("modulus is: " +mod);
    }
    
}
