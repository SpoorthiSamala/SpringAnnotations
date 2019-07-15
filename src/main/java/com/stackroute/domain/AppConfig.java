package com.stackroute.domain;


import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Movie movie(){
        return new Movie(getActor());
    }


    @Bean
    public Actor getActor(){
        Actor actor = new Actor("Bindu","Female",21);
        return actor;
    }

    @Bean(initMethod="customInit", destroyMethod = "customDestroy")
    public BeanLifeCycleDemoBean beanLifeCycleDemoBean(){
        return new BeanLifeCycleDemoBean();
    }

    }

