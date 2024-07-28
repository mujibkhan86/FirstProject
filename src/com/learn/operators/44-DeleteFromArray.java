package com.learn.operators;

import java.util.Scanner;

class DeleteFromArray {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to Delete From the Array:\n");
    int [] numArr = numArray();
      System.out.print("Now, enter the number you want to delete :");
      int noToDelete = input.nextInt();
      int [] newArr = deleteNumber(numArr, noToDelete);
      System.out.println("Here is your new Array:");
      ArrayUtility.display(newArr);
  }

  public static int[] deleteNumber(int [] numArray, int noToDelete){
        int occ = noOfOccurrences(numArray, noToDelete);
        if(occ == 0){
            return numArray;
        }
         int newSize = numArray.length - occ;
         int [] newArr = new int[newSize];

         int i = 0, j = 0;
         while (i < newArr.length){
             if(newArr[i] != noToDelete){
                 newArr[j] = numArray[i];
               j++;
             }
             i++;
         }
      return  newArr;
    }

    public static int noOfOccurrences(int [] numArray, int num){
      int occ = 0;
       int i = 0;
       while (i < numArray.length){
           if(numArray[i] == num){
               occ++;
           }
           i++;
       }
      return occ;
    }
  public static int[] numArray(){
   Scanner input = new Scanner(System.in);
   System.out.print("Please enter number :");
   int size = input.nextInt();
   int [] numbArray = new int[size];
   int i = 0;
   while (i < numbArray.length){
    System.out.print("Please enter numbers " + (i+1) + " : ");
    numbArray[i] = input.nextInt();;
    i++;
   }
   return  numbArray;
  }
}
