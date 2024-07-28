package com.learn.operators;

import java.util.Scanner;

class Search2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to search 2D Array\n");
        int[][] numbArr = ArrayUtility.input2DArray();
        System.out.print("Now, enter the number you want to search :");
        int num = input.nextInt();
        boolean isFound = search(numbArr, num);
        if ( isFound ) {
            System.out.println("Your number is found :" + num);
        } else {
            System.out.println("your number is not found : " + num);
        }
    }

    public static boolean search(int[][] numArr, int num) {
        int i = 0;
        while (i <numArr.length){
            int j = 0;
            while (j < numArr[i].length){
                if(numArr[i][j] == num){
                    return  true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
