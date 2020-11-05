package com.geekbrains.spring.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(value = "prototype")
public class Basket {
    @Value("Orange")
    public String color;

    @Override
    public String toString() {
        return "Basket: " + color;
    }
}
