package com.surasint.guice.c02BindingAnnotations;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * Created by surasint on 12/23/2016.
 */
public class BillingService {

    private CreditCardProcessor creditCardProcessor;

    @Inject
    public BillingService(@Named("Master") CreditCardProcessor creditCardProcessor){
        this.creditCardProcessor = creditCardProcessor;
    }

    public void service() {
        creditCardProcessor.test();
    }
}
