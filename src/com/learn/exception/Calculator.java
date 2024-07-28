package com.learn.exception;

import com.learn.operators.Arithmetic;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        a();
    }
    private static  void a(){
       b();
    }
    private static  void b(){
         c();
    }
    private static  void c(){
         d();
    }

    private static  void d(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Division Calculator:");
        System.out.print("Please enter two numbers: ");
        int first = input.nextInt();
        int second = input.nextInt();
        try {
            int[] a = new int[5];
            System.out.printf("Result is %d", a[6]);
            a[6] = first / second;
            System.out.printf("Result is %d", a[6]);
        }catch(ArithmeticException ex){
            System.out.printf("%s, enter a valid number", ex.getMessage());
        }/*catch (ArrayIndexOutOfBoundsException ex){
            System.out.printf("Array is out of bound %s ", ex);
        }*/catch (Exception ex){
            System.out.printf("Exception....... %s" , ex);
            throw ex;
        }
    }
}
