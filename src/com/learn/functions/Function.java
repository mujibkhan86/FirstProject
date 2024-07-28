package com.learn.functions;

public class Function {
    public static void main(String[] args) {
//        System.out.println("In main method");
//    greetUser();
//        System.out.println("Method calling complete");
//        greetUser();
        printFirstPattern();
    }
    public static void greetUser(){
        System.out.println("Good Morning From Learning Java Mujib");
    }
    public static void printFirstPattern(){
        //System.out.println(" * \n * *\n * * *\n * * * *\n * * * *");
        int rows = 0;
        while (rows < 5){
            System.out.print("*");
            int i = 0;

            while (i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;

        }
    }
}
