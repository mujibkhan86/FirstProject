package com.learn.operators;

import java.util.Scanner;

class GcdNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to GCD\n");
        System.out.print("Enter please first Number : ");
        int firstNum = input.nextInt();
        System.out.print("Enter please second Number : ");
        int secondNum = input.nextInt();
        int gcdNum = gcdNumber(firstNum, secondNum);
        System.out.println("GDC number is: " + gcdNum);
    }

    private static int gcdNumber(int firstNum, int secondNum) {
        int gcd = 1;
        int i = 2;
        int least = least(firstNum, secondNum);
        while (i <= least) {
            if (( firstNum % i == 0) && (secondNum % i == 0 )) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    private static int least(int num1, int num2) {
        if ( num1 < num2 ) {
            return num1;
        } else {
            return num2;
        }


    }
}