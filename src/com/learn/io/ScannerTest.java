package com.learn.io;

import java.io.*;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        try(InputStream file = new FileInputStream("C:\\corejavaworkspace\\FirstProject\\abc.txt");
            OutputStream outputStream = new FileOutputStream("C:\\corejavaworkspace\\FirstProject\\abc.txt");
            Scanner scanner = new Scanner(file)){
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.printf("%s , not found ", e.getMessage() );
        } catch (IOException e) {
            System.out.printf("%s, IOException", e.getMessage());
        }
    }
}
