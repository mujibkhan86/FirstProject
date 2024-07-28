package com.learn.operators;

import java.util.Scanner;

class LoopPattern {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to Pattern");
      System.out.print("Please enter the no of rows");
      int rows = input.nextInt();
      printRightHalfPyramid(rows);
      printReverseRightHalfPyramid(rows);
      printLeftHalfPyramid(rows);
  }
  public static void printReverseRightHalfPyramid(int maxRows){
      System.out.println("\nHere is Reverse Right Half Pyramid :");
   int rows = maxRows;
   while (rows > 0){
       int i = 0;
       while (i < rows){
           System.out.print(" *");
           i++;
       }
       System.out.println();
    rows --;
   }
  }

    public static void printLeftHalfPyramid(int maxRows){
        System.out.println("\nHere is Left Half Pyramid :");
        int rows = maxRows;
        while (rows > 0){
            int j =0;
            // this loop print spaces
           while (j < rows -1){
               System.out.print("  ");
           j++;
           }
            // this loop print *
            int i = 0;
            while (i <= (maxRows-rows)){
                System.out.print("* ");
            i++;
            }
            System.out.println();
            rows --;
        }
    }

  public static void printRightHalfPyramid(int maxRows){
      System.out.println("\nHere is Right Half Pyramid :");
      int rows =0;
      while (rows < maxRows){
          System.out.print("* ");
          int i = 0;
          while (i < rows){
              System.out.print("* ");
              i++;
          }
          System.out.println();
          rows++;
      }
  }
}
