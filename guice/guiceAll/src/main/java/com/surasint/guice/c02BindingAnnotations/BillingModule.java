package com.surasint.guice.c02BindingAnnotations;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * Created by surasint on 12/23/2016.
 */
public class BillingModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(CreditCardProcessor.class).to(CreditCardProcessorVisa.class);
        bind(CreditCardProcessor.class).annotatedWith(Names.named("Master")).to(CreditCardProcessorMaster.class);
    }

}
