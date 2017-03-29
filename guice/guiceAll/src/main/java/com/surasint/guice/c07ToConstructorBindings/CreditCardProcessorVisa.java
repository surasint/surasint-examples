package com.surasint.guice.c07ToConstructorBindings;

/**
 * Created by surasint on 12/23/2016.
 */
public class CreditCardProcessorVisa implements CreditCardProcessor {

    public CreditCardProcessorVisa(){
        System.out.println("CreditCardProcessorVisa: empty constructor");
    }

    public CreditCardProcessorVisa(String test){
        System.out.println("CreditCardProcessorVisa: NOT empty constructor: " +test);
    }
    @Override
    public void test() {
        System.out.println("Visa");
    }
}
