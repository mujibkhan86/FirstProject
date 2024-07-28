package com.learn.operators;

import java.util.Scanner;

class PalindromeArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker\n");
        int [] numArr = numArray();
        boolean isPal = isPalindromeArray(numArr);
        if(isPal){
            System.out.println("Your Array is Palindrome");
        }else{
            System.out.println("Your Array is not Palindrome");
        }
    }

    private static boolean isPalindromeArray(int[] numArr) {
        int i = 0;
        while (i < numArr.length/2) {
            if ( numArr[i] != numArr[(numArr.length - 1) - i] ) {
                return false;
            }
            i++;
        }
       return  true;
    }

    public static int[] numArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int size = input.nextInt();
        int [] numArr = new int [size];
         int i = 0;
         while (i <size){
             System.out.print("Please enter element " +(i+1) + " ");
             numArr[i] = input.nextInt();
             i++;
         }
      return  numArr;
    }
}


