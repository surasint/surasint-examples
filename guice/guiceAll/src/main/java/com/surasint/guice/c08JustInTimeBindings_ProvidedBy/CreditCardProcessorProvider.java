package com.surasint.guice.c08JustInTimeBindings_ProvidedBy;

import com.google.inject.Provider;

/**
 * Created by surasint on 12/24/2016.
 */
public class CreditCardProcessorProvider implements Provider<CreditCardProcessor> {

    @Override
    public CreditCardProcessor get() {
        System.out.println("CreditCardProcessorProvider.get()");
        return new CreditCardProcessorVisa();
    }
}
