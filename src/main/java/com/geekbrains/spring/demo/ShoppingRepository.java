package com.geekbrains.spring.demo;

import java.util.List;

public interface ShoppingRepository {
    List<Shopping> findAllPurchase();
    void addPurchase(Shopping purchase);
}
