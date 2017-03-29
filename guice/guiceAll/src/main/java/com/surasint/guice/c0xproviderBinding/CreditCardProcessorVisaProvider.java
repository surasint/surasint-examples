package com.surasint.guice.c0xproviderBinding;

import com.google.inject.Provider;

/**
 * Created by surasint on 12/23/2016.
 */
public class CreditCardProcessorVisaProvider implements  Provider<CreditCardProcessor> {

    @Override
    public CreditCardProcessor get() {
        System.out.println("CreditCardProcessorVisa.get()");
        return new CreditCardProcessorVisa();
    }
}
