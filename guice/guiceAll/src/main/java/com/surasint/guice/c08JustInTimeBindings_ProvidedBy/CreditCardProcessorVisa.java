package com.surasint.guice.c08JustInTimeBindings_ProvidedBy;

/**
 * Created by surasint on 12/23/2016.
 */
public class CreditCardProcessorVisa implements CreditCardProcessor {
    @Override
    public void test() {
        System.out.println("Visa");
    }
}
