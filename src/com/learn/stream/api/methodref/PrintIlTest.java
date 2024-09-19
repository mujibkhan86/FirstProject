package com.learn.stream.api.methodref;

import java.io.PrintStream;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class PrintIlTest {
    public static void main(String[] args) {
     //Consumer<String> consumerInput = System.out::println;
        Consumer<String> consumerInput = new PrintStream(System.out)::println;
        consumerInput.accept("hellohhhhh");

        BiConsumer<PrintStream, String> biConsumer = PrintStream::println;
        biConsumer.accept(new PrintStream(System.out), "Mariya Homaira Khan");
    }
    }

