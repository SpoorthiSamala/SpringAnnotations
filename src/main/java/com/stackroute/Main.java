package com.stackroute;

import com.stackroute.domain.AppConfig;
import com.stackroute.domain.BeanLifeCycleDemoBean;
import com.stackroute.domain.BeanPostProcessorDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Main {
    public static void main(String[] args) throws Exception {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie = context.getBean(Movie.class);
        movie.actorInformation();

        BeanLifeCycleDemoBean beanLifeCycleDemoBean = context.getBean(BeanLifeCycleDemoBean.class);
        BeanPostProcessorDemoBean beanPostProcessorDemoBean = context.getBean(BeanPostProcessorDemoBean.class);
        context.close();
    }
}
