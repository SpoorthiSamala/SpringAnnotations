package com.stackroute.domain;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {

    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialization method called");

    }

    public void customInit(){
        System.out.println("init");
    }
    public void customDestroy(){
        System.out.println("destroy");
    }
    public void destroy() throws Exception {
        System.out.println("destroy method called");
    }

}

