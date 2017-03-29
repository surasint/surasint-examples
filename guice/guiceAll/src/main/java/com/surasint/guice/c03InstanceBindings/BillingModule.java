package com.surasint.guice.c03InstanceBindings;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * Created by surasint on 12/23/2016.
 */
public class BillingModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(String.class).annotatedWith(Names.named("jdbc url")).toInstance("jdbc:mysql://localhost/pizza");
        bind(Integer.class).annotatedWith(Names.named("login time seconds")).toInstance(30);

    }

}
