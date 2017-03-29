package com.surasint.examples.mockito.example1;

/**
 * Created by surasint on 1/15/2017.
 */
public class DepositMoneyService {

    public final void deposit(String toAccount, double amount){
        System.out.println("do actual deposit");
    }
}
