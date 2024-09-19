package com.learn.pattern;

public class HollowRectangle {
    public static void main(String[] args) {
        int n= 4;
        int m= 5;

        for(int i =1; i<=n; i++){
            for(int j=1; j<=5; j++){
             if(i== 1 || j == 1 || i == n || j == m){
                 System.out.print("*");
             }else{
                 System.out.print(" ");
             }
            }
            System.out.println();
        }
        for (int i = 1; i <=4; i++) {
            for (int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("===============================");
        for (int i = 4; i >=1; i--) {
            for (int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("================================");
        // outer loop
        for(int i=1; i<=4; i++){
        // inner loop-> space print
            for (int j =1; j<=4-i; j++){
                System.out.print(" ");
            }
          // inner loop -> * print
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
