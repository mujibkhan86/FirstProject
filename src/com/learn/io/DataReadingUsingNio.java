package com.learn.io;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class DataReadingUsingNio {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\corejavaworkspace\\FirstProject\\abc.txt");
      try{
          if(path.getFileName() !=null){
              System.out.println(path.getFileName());
         // Files.write(path, "hello world".getBytes(), StandardOpenOption.WRITE);
          }
          // read the data.
          byte[] bb= Files.readAllBytes(path);
          System.out.println(new String(bb));
      }catch (IOException ex){
          System.out.printf("Exception occurred %s", ex.getMessage());
      }
    }
}
