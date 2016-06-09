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
public class Product {
    private String name;
    private int price;
    private int weight;

    public Product(String name, int price, int weight)
    {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }
}
