package com.surasint.guice.c09Scope_default;

/**
 * Created by surasint on 12/23/2016.
 */
public class CreditCardProcessorVisa implements CreditCardProcessor {
    public CreditCardProcessorVisa(){
        System.out.println("Constructor called");
    }
    @Override
    public void test() {
        System.out.println("Visa");
    }
}
