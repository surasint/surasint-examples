package com.surasint.guice.c03InstanceBindings;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * Created by surasint on 12/23/2016.
 */
public class BillingService {


    @Inject
    public BillingService(@Named("jdbc url") String jdbcUrl,@Named("login time seconds")Integer loginTime ){
        System.out.println("jdbc url" + jdbcUrl);
        System.out.println("login time seconds" + loginTime);
    }

}
