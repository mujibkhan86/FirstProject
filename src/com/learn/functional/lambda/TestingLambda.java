package com.learn.functional.lambda;

public class TestingLambda {
    public static void main(String[] args) {
        TestingLambda test = new TestingLambda();
                    int sum= test.sum(6,7);
        System.out.println();
        test.printString("This is the best course");
       // toPrint-> System.out.println(toPrint);
       // (a,b)-> a+b;
        // multiline function in lambda
        //(a,b)->{
        // int sum = a+b;
        // System.out.println(sum);
        // }
    }


    public void printString(String toPrint){
        System.out.println(toPrint);
    }
    public int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
}
