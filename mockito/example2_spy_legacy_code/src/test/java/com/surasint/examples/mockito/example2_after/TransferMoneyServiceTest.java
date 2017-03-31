package com.surasint.examples.mockito.example2_after;

import org.junit.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

/**
 * Created by surasint on 1/15/2017.
 */
public class TransferMoneyServiceTest {

    @Test
    public void test_transfer(){
        DepositMoneyService mockDepositMoneyService = mock(DepositMoneyService.class);
        WithdrawMoneyService mockWithdrawMoneyService = mock(WithdrawMoneyService.class);

        TransferMoneyService target = spy(new TransferMoneyService());

        doReturn(mockDepositMoneyService)
                .when(target).proxyDepositMoneyServiceCreator();

        doReturn(mockWithdrawMoneyService)
                .when(target).proxyWithdrawMoneyServiceCreator();

        target.transfer("accountA","accountB", 100);

        //money must be withdraw with correct account and amount
        verify(mockWithdrawMoneyService,times(1))
                .withdraw(
                        eq("accountA"),
                        eq(100d)
                );

        //money must be deposit with correct account and amount
        verify(mockDepositMoneyService,times(1))
                .deposit(
                        eq("accountB"),
                        eq(100d)
                );

        //withdraw must be called before deposit
        InOrder inOrder = inOrder(mockDepositMoneyService,mockWithdrawMoneyService);
        inOrder.verify(mockWithdrawMoneyService).withdraw(anyString(),anyDouble());
        inOrder.verify(mockDepositMoneyService).deposit(anyString(),anyDouble());
    }
}
