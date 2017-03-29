package com.surasint.guice.c08JustInTimeBindings_ProvidedBy;

import com.google.inject.ProvidedBy;

/**
 * Created by surasint on 12/23/2016.
 */
@ProvidedBy(CreditCardProcessorProvider.class)
public interface CreditCardProcessor {
    public void test();
}
