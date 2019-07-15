package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;


public class Movie {

    @Autowired
    Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void actorInformation(){
        actor.actorInfo();

    }
}

