package com.learn.executor.singlethread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestingMultipleThreadExecutor {
    public static void main(String[] args) throws InterruptedException {
        // using for multiple threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            PrintTask task  = new PrintTask((char)i );
            executorService.submit(task);
        }
         executorService.shutdown();
        System.out.println("\n****1");
        if(!executorService.awaitTermination(10, TimeUnit.SECONDS)){
            System.out.println("\n****2");
            executorService.shutdownNow();
        }
    }
}
