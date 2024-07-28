package com.learn.operators;

import java.util.Scanner;

class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Number");
        System.out.print("Please enter a number : ");
        int num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if ( isPalindrome ) {
            System.out.println("Your number is Palindrome " + num);
        } else {
            System.out.println("Your number is not Palindrome : " + num);
        }
    }

    public static boolean isPalindrome(int num) {
       // int reverse = reverse(num);
       // return num == reverse;
         return  num == reverse(num);
    }

    private static int reverse(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
