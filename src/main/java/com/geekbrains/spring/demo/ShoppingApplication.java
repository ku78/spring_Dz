package com.geekbrains.spring.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShoppingApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ShoppingApplicationConfig.class);

        ShoppingService shoppingService = context.getBean("shoppingService", ShoppingService.class);
        shoppingService.printAllPurchase();// Выводим список пакупок

        Basket basket1 = context.getBean("basket", Basket.class);
        Basket basket2 = context.getBean("basket", Basket.class);
        System.out.println(basket1.color);//выводим текуший цвет
        System.out.println(basket2.color);
        basket1.color = "Green"; //задаем другой цвет
        basket2.color = "White";
        System.out.println(basket1);//выводим  цвет
        System.out.println(basket2);



        context.close();
    }
}

