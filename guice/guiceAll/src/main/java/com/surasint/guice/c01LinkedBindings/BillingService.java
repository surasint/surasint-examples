package com.surasint.guice.c01LinkedBindings;

import com.google.inject.Inject;

/**
 * Created by surasint on 12/23/2016.
 */
public class BillingService {

    private CreditCardProcessor creditCardProcessor;

    @Inject
    public BillingService(CreditCardProcessor creditCardProcessor){
        this.creditCardProcessor = creditCardProcessor;
    }

    public void service() {
        creditCardProcessor.test();
    }
}
