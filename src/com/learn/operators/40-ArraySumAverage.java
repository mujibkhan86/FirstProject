package com.learn.operators;


class ArraySumAverage {
    //create a program to find the sum and average of all
    // elements in a array
    public static void main(String[] args) {
     System.out.println("Welcome to Array sum and average:");
     int [] numArray = ArrayUtility.inputArray();
     long sum  = sum(numArray);
     double avg = average(numArray);
        System.out.println("Sum of the numbers is : " + sum+ " and average of the numbers is : " +avg);
    }

    public static long sum(int [] numArray){
        int sum = 0;
        int i = 0;
        while (i< numArray.length){
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static double average(int [] numArray){
             double sum = sum(numArray);
        return sum/numArray.length;
    }
}
