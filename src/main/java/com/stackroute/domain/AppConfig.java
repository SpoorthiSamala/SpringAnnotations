package com.stackroute.domain;


import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Movie getDetails(){
        return new Movie();
    }


    @Bean
    public Actor getActor(){
        Actor actor = new Actor();
        actor.setName("Bindu");
        actor.setGender("Female");
        actor.setAge(21);
        return actor;
    }

}