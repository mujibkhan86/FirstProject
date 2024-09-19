package com.learn.dsa.array;

import java.util.Scanner;

public class TestStack {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        MyQueue myQueue = new MyQueue();
        do {
            System.out.println("------------------Stack Meni-----------");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("-----------------------");
            System.out.print("Enter your Choice: ");
            choice = input.nextInt();

            switch (choice){
                case 1 : myQueue.push();
                break;
                case 2 : myQueue .pop();
                    break;
                case 3 : myQueue.display();
                    break;
                case 4 :
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }while (choice!=4);
    }
}
