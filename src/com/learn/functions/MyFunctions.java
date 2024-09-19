package com.learn.functions;

import java.util.Scanner;

public class MyFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String name = sc.next();
        int a = sc.nextInt();
        int b= sc.nextInt();
         int sum = calculateSum(a,b);
        System.out.println("sum of 2 numbers is: " +sum);

       // printMyName(name);
    }
    public static  int calculateSum(int a, int b){
        return a+b;
    }
    public static  void  printMyName(String name){
        System.out.println(name); // call kiya function ko
    }
}
