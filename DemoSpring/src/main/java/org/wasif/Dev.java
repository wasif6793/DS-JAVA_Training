package com.wasif.MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired //field injection
    @Qualifier("desktop")
    private Computer comp;
    public void build(){
        comp.compile();
        //laptop.debug();
        System.out.println("I am Awesome bro. cz I am Wasif maybe i am not awesome cz I am Wasif or I am");
    }
}