package com.surasint.concurrency;

import java.util.concurrent.CompletableFuture;

/**
 * example how to use CompletableFuture with thenAcceptBoth
 */
public class TestCompletableFuture {
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture.supplyAsync(
                ()-> {
                    System.out.println(1);
                    try{
                        Thread.sleep(3000);
                    }catch (Exception e){

                    }
                    System.out.println(2);
                    return "1";
                }).thenAcceptBoth(
                    CompletableFuture
                            .supplyAsync(()-> {
                                System.out.println(3);
                                try{
                                    Thread.sleep(4000);
                                }catch (Exception e){

                                }
                                System.out.println(4);
                                return "1";
                            })
                , (foundGames, recommendedGames) -> {
                   System.out.println(foundGames +recommendedGames);
                }).join();

    }
}
