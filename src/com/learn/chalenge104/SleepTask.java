package com.learn.chalenge104;

public class SleepTask implements Runnable{
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.printf("Stated with Thread %s\n",thread.getName());
        try {
            Thread.sleep(getRandom() * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Ended with Thread %s\n",thread.getName());

    }
    private int getRandom(){
        double random = Math.random() * 5+1;
        return (int)random;
    }
}
