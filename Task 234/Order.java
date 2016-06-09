/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ssu.artem_timonin.java.task2;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ARTEM
 */
public class Order {
    
    private List<OrderItem> items;
    private Employee employee;

    public Order(Employee employee) {
        items = new ArrayList<OrderItem>();
        this.employee = employee;
    }

    public void addProduct(Product product, Integer amount) {
        items.add(new OrderItem(product, amount));
    }

    /*
    * Отчёт для столовой. Поля: название блюда, количество, стоимость.
    * Стоимость заказа в конце отчёта.
    * */

    public void showReportForCanteen() throws NullNameException {
        Integer totalPrice = 0;

        for (OrderItem item : items) {
            int itemPrice = item.calculatePrice();
            totalPrice += itemPrice;
       /* if (item.getProductName()==null )
        { 
            throw new NullNameException ("Name has been Null", item.getProductName());
        }*/
            System.out.format("%s (%dx) - %d RUB\n", item.getProductName(), item.getAmount(), itemPrice);
        }

        System.out.println("Total price: " + totalPrice + " RUB");
        
        
        
        
    }

    /*
    * Отчёт для раздачи заказанных блюд сотрудникам.
    * Поля: имя сотрудника, заказанные блюда, стоимость его обеда.
    * */

    public void showReportForDistribution() throws LastNameException {
        System.out.println(employee.getName());

        int totalPrice = 0;

        for (OrderItem item : items) {
            System.out.println(item.getProductName());
            totalPrice += item.calculatePrice();
        }

        System.out.println("Total price: " + totalPrice + " RUB");
    }
}
