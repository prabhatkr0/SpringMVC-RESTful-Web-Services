package com.webservice.mobile.app.security;

import com.webservice.mobile.app.SpringApplicationContext;


public class SecurityConstants {
   

    public static String getTokenSecret(){
        AppProperties appProperties = (AppProperties) SpringApplicationContext.
                getBean("AppProperties");
        return appProperties.getTokenSecret();
    }
}
