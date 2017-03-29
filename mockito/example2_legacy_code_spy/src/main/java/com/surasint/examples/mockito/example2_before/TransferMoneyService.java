package com.surasint.examples.mockito.example2_before;

/**
 * Created by surasint on 1/15/2017.
 */
public class TransferMoneyService {

    private DepositMoneyService depositeMoneyService;
    private WithdrawMoneyService withdrawMoneyService;

    public void transfer(String fromAccount, String toAccount, double amount){

        this.depositeMoneyService = new DepositMoneyService();
        this.withdrawMoneyService = new WithdrawMoneyService();

        withdrawMoneyService.withdraw(fromAccount,amount);
        depositeMoneyService.deposit(toAccount,amount);
    }


}
