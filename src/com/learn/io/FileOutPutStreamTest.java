package com.learn.io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutPutStreamTest {
    public static void main(String[] args) {
        try(OutputStream out = new FileOutputStream("C:\\corejavaworkspace\\FirstProject\\abc.txt")){
            //ByteArrayOutputStream stream = new ByteArrayOutputStream(out.toString().length())){
            String str = "I love you huma khan";
            byte[] b = str.getBytes();
             out.write(b);

            System.out.println("Successfully write..");
        }catch (IOException ex){
            System.out.printf("Exception occurred %s", ex.getMessage());
        }
    }
}
