package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.DefaultResourceLoader;


public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie = context.getBean(Movie.class);
        movie.actorInformation();


        BeanFactory factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie1 = factory.getBean(Movie.class);
        movie1.actorInformation();

        BeanDefinitionRegistry beanDefinitionRegistry = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie2 = ((ApplicationContext)beanDefinitionRegistry).getBean(Movie.class);
        movie2.actorInformation();

    }
}
