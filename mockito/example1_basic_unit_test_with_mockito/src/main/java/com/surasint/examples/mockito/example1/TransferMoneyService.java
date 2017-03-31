package com.surasint.examples.mockito.example1;

/**
 * Created by surasint on 1/15/2017.
 */
public class TransferMoneyService {

    private DepositMoneyService depositMoneyService;
    private WithdrawMoneyService withdrawMoneyService;

    public TransferMoneyService(DepositMoneyService depositMoneyService, WithdrawMoneyService withdrawMoneyService){
        this.depositMoneyService = depositMoneyService;
        this.withdrawMoneyService = withdrawMoneyService;
    }

    public void transfer(String fromAccount, String toAccount, double amount){
        withdrawMoneyService.withdraw(fromAccount,amount);
        depositMoneyService.deposit(toAccount,amount);
    }


}
