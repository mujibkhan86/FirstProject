package com.learn.operators;
import java.util.Scanner;
class PalindromeRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to String Palindrome checker\n");
        System.out.print("Please enter a string to be checked: ");
        String str = input.next();
        System.out.println("Your string is :"
                +((isPalindrome(str) ? "Palindrome"
                                     : "Not Palindrome")));
    }
    public static boolean isPalindrome(String str){
        if(str.length() <= 1){
            return  true;
        }
        int lastPosition = str.length() -1; // last position

        if(str.charAt(0) != str.charAt(lastPosition)){
             return false;
        }
        String newStr = str.substring(1, lastPosition);
        return isPalindrome(newStr);
    }
}
