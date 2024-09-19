package com.learn.chalenge105;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestingFactorial {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        List<Future<Integer>> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
         FactorialCalculator task = new FactorialCalculator(i);
        list.add(service.submit(task));
        }
        for (Future<Integer> future : list) {
            System.out.printf("\n Result is %d",future.get());
        }
        service.shutdown();
        if(!service.awaitTermination(10, TimeUnit.SECONDS)){
            System.out.println("BAHUT HUA BAS");
            service.shutdown();
        }
    }
}
