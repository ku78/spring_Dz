package com.geekbrains.spring.demo;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DaoShoppingRepository implements ShoppingRepository {
    @Override
    public List<Shopping> findAllPurchase() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void addPurchase(Shopping purchase) {
        throw new UnsupportedOperationException();
    }
}
