package com.geekbrains.spring.demo;

public class Shopping {
    private Long id;
    private String purchaseName;
    private int quantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPurchaseName() {
        return purchaseName;
    }

    public void setPurchaseName(String purchaseName) {
        this.purchaseName = purchaseName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Shopping(Long id, String purchaseName, int quantity) {
        this.id = id;
        this.purchaseName = purchaseName;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("List purchase  [ id: %d, purchase name: %s, quantity: %s kg ]", id, purchaseName, quantity);
    }


}
