package com.learn.operators;

import java.util.Scanner;

class CheckGreaterNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to check greater number\n");
        System.out.print("Please enter first number: ");
        int firstNum = input.nextInt();
        System.out.print("Please enter second number : ");
        int secondNum = input.nextInt();
        System.out.print("Please enter third number :");
        int thirdNum = input.nextInt();

        if((firstNum >= secondNum) && (firstNum >= thirdNum)) {
            System.out.println("first is greater :" + firstNum);
        } else if ( secondNum >= thirdNum ) {
            System.out.println("second number is greater : " + secondNum);
//        }
//        else if ( (secondNum > firstNum) && (secondNum>thirdNum )) {
//            System.out.println("second number is greater : " +secondNum);
//        }
        }else{
            System.out.println("third number is greater : " + thirdNum);
        }
    }

}
