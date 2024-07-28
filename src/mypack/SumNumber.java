package mypack;

import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Please Enter Second Number : ");
        int num2 = input.nextInt();;
        System.out.println("Total sum is : "+(num1+num2));
    }
}
