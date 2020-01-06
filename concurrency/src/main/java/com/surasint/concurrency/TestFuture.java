package com.surasint.concurrency;

import com.sun.org.apache.xalan.internal.utils.FeatureManager;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class TestFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask f = new FutureTask(() -> {
            System.out.println("1");
            Thread.sleep(1000);
            System.out.println("2");
            return true;
        });
        System.out.println(3);
        f.run();
        System.out.println(4);
        f.get();
        System.out.println(5);
    }
}
