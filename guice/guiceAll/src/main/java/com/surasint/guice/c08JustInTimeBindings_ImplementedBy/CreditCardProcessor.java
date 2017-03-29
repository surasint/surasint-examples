package com.surasint.guice.c08JustInTimeBindings_ImplementedBy;

import com.google.inject.ImplementedBy;

/**
 * Created by surasint on 12/23/2016.
 */
@ImplementedBy(CreditCardProcessorVisa.class)
public interface CreditCardProcessor {
    public void test();
}
