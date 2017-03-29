package com.surasint.guice.c02BindingAnnotations;

/**
 * Created by surasint on 12/23/2016.
 */
public class CreditCardProcessorMaster implements CreditCardProcessor {
    @Override
    public void test() {
        System.out.println("Master");
    }
}
