package com.learn.executor.futures;

import java.util.concurrent.*;

public class TestingFutures {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService =Executors.newFixedThreadPool(4);
        FetchName task1 = new FetchName("Huma");
        FetchName task2 = new FetchName("Mariya");
        FetchName task3 = new FetchName("Homaira");
        FetchName task4 = new FetchName("Mujib");
        Future<String> name1  =executorService.submit(task1);
        Future<String> name2  =executorService.submit(task2);
        Future<String> name3  =executorService.submit(task3);
        Future<String> name4  =executorService.submit(task4);
        System.out.printf("\nFull Name is %s", name1.get());
        System.out.printf("\nFull Name is %s", name2.get());
        System.out.printf("\nFull Name is %s", name3.get());
        System.out.printf("\nFull Name is %s", name4.get());
                 executorService.shutdown();
    }
}
