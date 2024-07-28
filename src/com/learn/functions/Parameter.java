package com.learn.functions;

public class Parameter {
    public static void main(String[] args) {
//int num = sumTwoNumbers(2,3);
       // System.out.println("sum is : " +num);
        System.out.println(sumTwoNumbers(2,3));
        System.out.println(sumTwoNumbers(10,22));
        System.out.println(sumTwoNumbers(-5,5));
    }

    public static int sumTwoNumbers(int first, int second){
        System.out.println("First number is : " +first);
        System.out.println("Second number is : " +second);
        return first + second;
    }
}
