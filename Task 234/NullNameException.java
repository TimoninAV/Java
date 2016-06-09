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
public class NullNameException extends Exception {
    private String  name;
     public NullNameException(String message, String name){
     
        super(message);
        this.name=name;
    }
}
