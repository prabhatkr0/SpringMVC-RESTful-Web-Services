package com.webservice.mobile.app;

import com.webservice.mobile.app.security.AppProperties;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;

public class SpringApplicationContext implements ApplicationContextAware {

    private static ApplicationContext CONTEXT;

    

    public static Object getBean(String beanName){
        return CONTEXT.getBean(beanName);
    }


}
