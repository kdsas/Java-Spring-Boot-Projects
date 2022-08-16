package com.example.demo;

import org.springframework.context.annotation.Bean;

public class AnnotationConfig {
@Bean

    public Car car(Engine engine) {
        return new Car(engine);

    }

    

    @Bean

    public Engine engine(Camshaft camshaft, Crankshaft crankshaft) {

        return new CombustionEngine(camshaft, crankshaft);

    }

    

    @Bean

    public Camshaft camshaft() {

        return new Camshaft();

    }

    

    @Bean

    public Crankshaft crankshaft() {

        return new Crankshaft();

    }

}
