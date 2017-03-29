package com.surasint.examples.mockito.example1;

import org.junit.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

/**
 * Created by surasint on 1/15/2017.
 */
public class TransferMoneyServiceTest {

    /**
     * when
     *      transfer from accountA to accountB for 100
     * expect
     *      withdraw from accountA for 100
     *      deposit to accountB for 100
     *      withdraw must be called be for deposit
     */
    @Test
    public void test_transfer(){
        DepositMoneyService mockDepositService = mock(DepositMoneyService.class);
        WithdrawMoneyService mockWithdrawMoneyService = mock(WithdrawMoneyService.class);

        TransferMoneyService target = new TransferMoneyService(mockDepositService,mockWithdrawMoneyService);

        target.transfer("accountA","accountB", 100);

        //money must be withdraw with correct account and amount
        verify(mockWithdrawMoneyService,times(1))
                .withdraw(
                        eq("accountA"),
                        eq(100d)
                );

        //money must be deposit with correct account and amount
        verify(mockDepositService,times(1))
                .deposit(
                        eq("accountB"),
                        eq(100d)
                );

        //withdraw must be called before deposit
        InOrder inOrder = inOrder(mockDepositService,mockWithdrawMoneyService);
        inOrder.verify(mockWithdrawMoneyService).withdraw(anyString(),anyDouble());
        inOrder.verify(mockDepositService).deposit(anyString(),anyDouble());
    }
}
