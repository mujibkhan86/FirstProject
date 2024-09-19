package com.learn.stream.api.methodref;

import com.learn.runnable.PrintTask;

public class PrintTest {
    public static void main(String[] args) {
        IPrint iPrint = PrintTest::print;    //(str)-> System.out.println(str);
        iPrint.printData("hello");
    }
    public static String print(String str){
        System.out.println(str);
        return str;
    }
}
