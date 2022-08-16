package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Car {

  

    private Engine engine;

  

    public Car(Engine engine) {

        this.engine = engine;

    }

    

   


    

    public void start() {

        engine.turnOn();

    }
}
