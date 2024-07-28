package com.learn.operators;

import java.util.Scanner;

class Grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Grading Calculator\n");
        System.out.println("Please enter the mark: ");
        float percentage = input.nextFloat();
        if(percentage >= 90){
            System.out.println("Great, You have got A");
        } else if ( percentage >= 75 ) {
            System.out.println("Good, You have got B");
        } else if ( percentage >= 60 ) {
            System.out.println("You have got C, Work hard next time");
        } else if ( percentage >= 30 ) {
            System.out.println("You have got D, seriously you need to work hard");
        }else{
            System.out.println("Sorry, you have failed and got the F");
        }
    }
}
