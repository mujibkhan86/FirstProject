package com.learn.chalenge88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of the file you wish want to read.");
        String fileName = input.next();
        try(FileReader reader = new FileReader(fileName)){
            int read = 0;
           /* do{
                read = reader.read();
                System.out.println((char) read);
            }while (read !=-1);*/
            while((read = reader.read())!=-1){
                System.out.print((char) read);
            }
        }catch (FileNotFoundException ex){
            System.out.printf("%s Not Found occurred", fileName);
        }catch (IOException e){
            System.out.printf("IOException occurred %s ", e.getMessage());
        }
    }
}
