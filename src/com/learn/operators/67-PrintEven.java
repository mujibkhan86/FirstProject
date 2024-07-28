package com.learn.operators;

class PrintEven {
    public static void main(String[] args) {
        System.out.println("Welcome to print even number\n");
        int num = 0;
        for(int i = 1; i<=100; i++){
            // check the number is odd or not
            if(i %2 == 1){
                continue;
            }
            System.out.println(i);
        }
    }
}
