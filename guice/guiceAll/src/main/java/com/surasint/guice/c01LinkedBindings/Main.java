package com.surasint.guice.c01LinkedBindings;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * from this https://github.com/google/guice/wiki/LinkedBindings
 * Created by surasint on 12/23/2016.
 */
public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new BillingModule());
        BillingService billingService = injector.getInstance(BillingService.class);
        billingService.service();
    }
}
