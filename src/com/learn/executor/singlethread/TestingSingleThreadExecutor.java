package com.learn.executor.singlethread;

import com.learn.runnable.PrintTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingSingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        // using for multiple threads
       // ExecutorService executorService = Executors.newFixedThreadPool(3);
        PrintTask task1  = new PrintTask('*');
        PrintTask task2  = new PrintTask('$');
        PrintTask task3 = new PrintTask('#');
         executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);

         executorService.shutdown();
    }
}
