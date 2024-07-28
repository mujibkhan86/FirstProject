package com.learn.operators;
import java.util.Scanner;
class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Sum of Digit world :");
        System.out.print("Please enter the Number: ");
         int num = input.nextInt();
         int sum =sumOfDigits(num);
        System.out.println("Sum of digit is : " + sum);
    }
    public static int sumOfDigits(int num){
        int sum =0;
        while (num > 0){
         //sum = sum + (num % 10);
            sum+= num % 10;
            //num = num/10;
            num/= 10;
        }
        return sum;
    }
}
