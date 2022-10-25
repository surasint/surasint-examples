package com.surasint.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

/**
 * example : ForkJoinPool gives private thread pool to parallelStream
 */
public class TestForkJoinPool {
    public static void main(String[] args) throws InterruptedException {
        {
            new Thread( () -> {
                System.out.println("start 1 ");
                List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
                ForkJoinPool parallelPool = new ForkJoinPool(1);
                parallelPool.submit(() -> {
                    numbers.parallelStream().forEach(number -> {
                        System.out.println(Thread.currentThread().getName() + " xxxx " + number);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println(Thread.currentThread().getName() + " xxxx " + number + " end ");
                    });
                }).invoke();
            }).start();
        }
        {
            new Thread( () -> {
                System.out.println("start 2 ");
                List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 1010);
                ForkJoinPool parallelPool = new ForkJoinPool(5);
                parallelPool.submit(() -> {
                    numbers.parallelStream().forEach(number -> {
                        System.out.println(Thread.currentThread().getName() + " xxxx " + number);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println(Thread.currentThread().getName() + " xxxx " + number + " end ");
                    });
                }).invoke();
            }).start();
        }
        Thread.sleep(10000);
    }
}
