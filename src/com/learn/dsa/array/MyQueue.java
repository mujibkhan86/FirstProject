package com.learn.dsa.array;

import java.util.Scanner;
import java.util.Stack;

public class MyQueue {

    private int top =-1;
    private final int MAXSIZE = 3;
    private final int[] stack = new int[MAXSIZE];
    Scanner in = new Scanner(System.in);
public void push(){
    int n;
    if(top == MAXSIZE-1)
        System.out.println("Stack is Over flow");
      else{
        System.out.println("Please Enter a Push element : ");
          n = in.nextInt();
          top++;
          stack[top] = n;
    }
}

    public void pop(){
    if(top == -1)
        System.out.println("Stack is empty");
    else {
        int n;
        n = stack[top];
        top--;
        System.out.println("poped element is : " +n);
    }
    }

    public void display(){
        if(top == -1)
            System.out.println("Stack is empty");
        else{
            System.out.println("elements of Stack is : ");
            for(int i = top; i >=0; i--){
                System.out.println(stack[i]);
            }
        }
    }
}
