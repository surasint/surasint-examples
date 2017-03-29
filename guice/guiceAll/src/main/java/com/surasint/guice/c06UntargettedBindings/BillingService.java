package com.surasint.guice.c06UntargettedBindings;

import com.google.inject.Inject;

/**
 * Created by surasint on 12/23/2016.
 */
public class BillingService {

    private ConcreteCreditCardProcessor concreteCreditCardProcessor;

    @Inject
    public BillingService(ConcreteCreditCardProcessor concreteCreditCardProcessor){
        this.concreteCreditCardProcessor = concreteCreditCardProcessor;
    }

    public void service() {
        concreteCreditCardProcessor.test();
    }
}
