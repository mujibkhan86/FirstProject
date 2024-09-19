package com.learn.runnable;

public class TestingRunnable {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');
        Thread t1 = new Thread(p1);
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.setPriority(Thread.NORM_PRIORITY);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();
        System.out.println("\n # task complete : ");
        long endTime  =System.currentTimeMillis();
        System.out.printf("Total time take %d ", (endTime -startTime));
    }
}
