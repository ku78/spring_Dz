package com.geekbrains.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShoppingService {
    private ShoppingRepository shoppingRepository;

    @Autowired
    public void setInMemoryShoppingRepository(@Qualifier(value = "inMemoryShoppingRepository") ShoppingRepository shoppingRepository) {
        this.shoppingRepository = shoppingRepository;
    }

    public void printAllPurchase() {
        List<Shopping> shopping = shoppingRepository.findAllPurchase();
        for (Shopping s : shopping) {
            System.out.println(s);
        }
    }
}