package com.learn.relation.operators;

import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Driving Licence Portal:\n");
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        if(age >= 18){
            System.out.println("You are eligible for Driving Licence");
        }else {
            System.out.println("Beta cycle challah ab hi");
        }
    }
}
