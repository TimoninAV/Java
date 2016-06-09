/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ssu.artem_timonin.java.task2;

/**
 *
 * @author ARTEM
 */
public class OrderItem {
    private Product product;
    private int amount;

    public OrderItem(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    public String getProductName() {
        return product.getName();
    }

    public int getAmount() {
        return amount;
    }

    public int calculatePrice() {
        return product.getPrice() * amount;
    }
}
