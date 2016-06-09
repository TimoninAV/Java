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
public class Employee {
     private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    
    public String getName() throws LastNameException 
    { if (lastName==null)
    {
        throw new LastNameException ("Name has been Null", lastName);
    }
        return lastName + " " + firstName.substring(0, 1) + ".";
}
}