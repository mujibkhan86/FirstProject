package com.learn.loop;

import java.util.Scanner;

public class TestForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nSame code using while loop");
        int n= 0;
        while (n<=10){
            System.out.print(n + " ");
            n++;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease enter the number that you want to sum ");
        int input = sc.nextInt();
        int sum = 0;

        for(int i =1; i <=input; i++){
            sum = sum +i;
            //1+2+3+4
        }
        System.out.println(sum);
        System.out.println("Print the table" + n);
        for(int i =1; i<=10 ; i++){
            System.out.println((input*i));
        }
    }
}
