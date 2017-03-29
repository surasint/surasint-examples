package com.surasint.guice.c01LinkedBindings;

import com.google.inject.AbstractModule;

/**
 * Created by surasint on 12/23/2016.
 */
public class BillingModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(CreditCardProcessor.class).to(CreditCardProcessorVisa.class);
    }
}
