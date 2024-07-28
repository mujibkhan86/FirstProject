package com.learn.operators;

import java.util.Scanner;

class MultiplicationTableForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to multiplication table\n");
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        for(int i =1; i<=10; i++){
            System.out.println(num + " X " + i+ " = " +(num*i));
        }
    }
}
