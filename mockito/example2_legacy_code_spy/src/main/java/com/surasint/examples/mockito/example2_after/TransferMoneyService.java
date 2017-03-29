package com.surasint.examples.mockito.example2_after;

/**
 * Created by surasint on 1/15/2017.
 */
public class TransferMoneyService {

    private DepositMoneyService depositeMoneyService;
    private WithdrawMoneyService withdrawMoneyService;

    public void transfer(String fromAccount, String toAccount, double amount){
        this.depositeMoneyService = proxyDepositMoneyServiceCreator();
        this.withdrawMoneyService = proxyWithdrawMoneyServiceCreator();

        withdrawMoneyService.withdraw(fromAccount,amount);
        depositeMoneyService.deposit(toAccount,amount);
    }

    DepositMoneyService proxyDepositMoneyServiceCreator() {
        return new DepositMoneyService();
    }

    WithdrawMoneyService proxyWithdrawMoneyServiceCreator() {
        return new WithdrawMoneyService();
    }

}
