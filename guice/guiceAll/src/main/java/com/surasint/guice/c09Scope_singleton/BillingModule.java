package com.surasint.guice.c09Scope_singleton;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

/**
 * Created by surasint on 12/23/2016.
 */
public class BillingModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(CreditCardProcessor.class).to(CreditCardProcessorVisa.class).in(Singleton.class);
    }

}
