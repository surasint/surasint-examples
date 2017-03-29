package com.surasint.guice.c02BindingAnnotations;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * Created by surasint on 12/23/2016.
 */
public class BillingService {

    private CreditCardProcessor creditCardProcessor1;
    private CreditCardProcessor creditCardProcessor2;

    @Inject
    public BillingService(CreditCardProcessor creditCardProcessor1,@Named("Master") CreditCardProcessor creditCardProcessor2){
        this.creditCardProcessor1 = creditCardProcessor1;
        this.creditCardProcessor2 = creditCardProcessor2;
    }

    public void service() {
        creditCardProcessor1.test();
        creditCardProcessor2.test();
    }
}
