package com.learn.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {
    public static void main(String[] args) {
        try(InputStream in = new FileInputStream("myfile.txt")){
            int i = 0;
            while ((i = in.read())!=-1){
                char c =(char) i;
                System.out.print(c);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
