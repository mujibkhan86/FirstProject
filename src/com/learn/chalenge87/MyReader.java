package com.learn.chalenge87;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyReader {
    public static void main(String[] args) {
        String fileName = "java-course.txt";
        try(FileReader writer =  new FileReader(fileName)){
            int read = 0;
        do{
            read = writer.read();
            System.out.print((char) read);
        }while (read != -1);
        }catch (IOException ex){
            System.out.printf("Exception occurred %s",ex.getMessage());
        }
    }
}
