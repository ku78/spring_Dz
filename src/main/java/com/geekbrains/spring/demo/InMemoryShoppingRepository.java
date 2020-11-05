package com.geekbrains.spring.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class InMemoryShoppingRepository implements ShoppingRepository {
    private List<Shopping> purchases;
////
//    public void setPurchases(List<Shopping> purchases) {
//
//    }

//    public InMemoryShoppingRepository(List<Shopping> purchases) {
//        this.purchases = new ArrayList<>();
//        this.purchases.add(new Shopping(1L, "carrot", 12));
//        this.purchases.add(new Shopping(2L, "potato", 10));
//    }

    @PostConstruct
    public void init() {
        this.purchases = new ArrayList<>();
        this.purchases.add(new Shopping(1L, "carrot", 12));
        this.purchases.add(new Shopping(2L, "potato", 10));
    }

    public List<Shopping>  findAllPurchase() {
        return Collections.unmodifiableList(purchases);
    }

    public void addPurchase(Shopping purchase) {
        purchases.add(purchase);
    }
}
