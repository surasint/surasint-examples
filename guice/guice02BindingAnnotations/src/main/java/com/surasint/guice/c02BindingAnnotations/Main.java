package com.surasint.guice.c02BindingAnnotations;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * from https://github.com/google/guice/wiki/BindingAnnotations
 * Created by surasint on 12/23/2016.
 */
public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new BillingModule());
        BillingService billingService = injector.getInstance(BillingService.class);
        billingService.service();
    }
}
