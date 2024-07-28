package com.learn.operators;

import java.util.Scanner;

class PassWorldChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to set your password\n");
        String password;
        do{
            System.out.print("Please enter your password: ");
             password = input.next();
        }while (!isValidaPassword(password));
        System.out.println("Thank for entering valid password.");
    }
    public static boolean isValidaPassword(String password){
        return password.length() >6;
    }
}
