package com.learn.operators;
import java.util.Scanner;
class OccurrencesForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to finding Occurrences element\n");
        int [] numbers  = ArrayUtility.inputArray();
        System.out.print("Now, enter the number you want to search: ");
        int element = input.nextInt();
        int count = countOccurrences(numbers, element);
        System.out.println("Your element was found: " +count+ " times");
    }
    public static int countOccurrences(int [] numbers, int element){
       int occ =0;
       for(int num : numbers){
        if(num == element) {
            occ++;
        }
       }
        return occ;
    }
}
