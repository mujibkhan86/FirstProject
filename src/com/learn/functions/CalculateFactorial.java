package com.learn.functions;

import java.util.Scanner;

public class CalculateFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial is : "+callFact(n));
    }
    public static int callFact(int n){
        if(n<0){
            System.out.println("Invalid number");
            return n;
        }
        int fact =1;
        for(int i =n; i>=1; i--){
         fact *= i;
        }
        return fact;
    }
}
