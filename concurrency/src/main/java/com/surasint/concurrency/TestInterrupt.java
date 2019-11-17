package com.surasint.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TestInterrupt {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<?> future = executor.submit(() -> {
            System.out.println("printNumbers 1");
            printNumbers(); // first call
            System.out.println("printNumbers 2");
            printNumbers(); // second call
            System.out.println("printNumbers 2 end ");
        });
        Thread.sleep(3_000);
        System.out.println("shutdownNow");
        executor.shutdownNow();  // will interrupt the task
        System.out.println("awaitTermination");
        executor.awaitTermination(3, TimeUnit.SECONDS);
        System.out.println("end");
    }
    private static void printNumbers() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            try {
                System.out.println("sleep");
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
                //Try to uncomment this
//                Thread.currentThread().interrupt(); // preserve interruption status
                break;
            }
        }
    }
}
