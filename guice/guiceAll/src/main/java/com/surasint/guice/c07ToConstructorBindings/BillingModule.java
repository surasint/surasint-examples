package com.surasint.guice.c07ToConstructorBindings;

import com.google.inject.AbstractModule;

/**
 * Created by surasint on 12/23/2016.
 */
public class BillingModule extends AbstractModule {

    @Override
    protected void configure() {
        try {
            bind(CreditCardProcessor.class).toConstructor(CreditCardProcessorVisa.class.getConstructor(String.class));
        } catch (NoSuchMethodException e) {
            addError(e);
        }
    }

}
