package com.learn.chalenge87;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to calculator\n");
        System.out.print("Enter first number:");
        int first = input.nextInt();
        System.out.println("Enter second number:");
        int second = input.nextInt();
        try{
            int result = first/second;
            System.out.printf("Result is %d", result);
        }catch (ArithmeticException ex){
            if(ex.getMessage()
                    .equalsIgnoreCase("/ by zero")){
                System.out.println("divide by zero occurred");

            }else{
                throw ex;
            }
        }
    }
}
