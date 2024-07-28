package com.learn.io;

import java.io.*;

public class BufferedOutPutStreamTest {
    public static void main(String[] args) {
        try(OutputStream input = new FileOutputStream("mytestdata.txt");
            BufferedOutputStream stream =  new BufferedOutputStream(input);
            InputStream inputStream =  new FileInputStream("mytestdata.txt");
            BufferedInputStream bufferedInputStream =  new BufferedInputStream(inputStream)){
            String ss ="myname is khan";
            stream.write(ss.getBytes());
            // read the data.
            int read =0;
            while((read = bufferedInputStream.read())!=-1){
                System.out.print((char) read);
            }
        }catch (IOException ex){
            System.out.println("Exception occured"+ex.getMessage());
        }
    }
}
