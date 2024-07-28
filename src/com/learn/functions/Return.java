package com.learn.functions;

import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greet();
        int firstNum = readNumber() + 1;
        int secondNum = readNumber() +2;

        int sum = firstNum+secondNum;
        System.out.println("Sum is : " +sum);
    }
public static int readNumber(){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the number: ");
    int number= input.nextInt();
    return number;
}
     static void greet(){
        System.out.println("Welcome to the Calculator\n");
    }
}
