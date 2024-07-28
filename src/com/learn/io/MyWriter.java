package com.learn.io;

import java.io.FileWriter;
import java.io.IOException;

public class MyWriter {
    public static void main(String[] args) {
        String fileName = "java-course.txt";
        try (FileWriter writer = new FileWriter(fileName)){
            writer.write("this is my java learning class\n");
            for (int i = 0; i < 100; i++) {
                writer.write('*');
            }
            writer.flush();

            System.out.println("File written successfully: ");
        }catch (IOException ex){
            System.out.printf("IOException : %s" , ex.getMessage());
        }
    }
}
