package com.surasint.guice.c03InstanceBindings;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * from https://github.com/google/guice/wiki/InstanceBindings
 * Created by surasint on 12/23/2016.
 */
public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new BillingModule());
        BillingService billingService = injector.getInstance(BillingService.class);
    }
}
