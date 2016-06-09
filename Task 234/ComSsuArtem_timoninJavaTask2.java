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
public class ComSsuArtem_timoninJavaTask2 {
     public static void main(String[] args) throws NullNameException 
     {
         
        ComSsuArtem_timoninJavaTask2 app = new ComSsuArtem_timoninJavaTask2();
     
         app.startApplication();
         System.out.println();
         app.startApplication1();
         System.out.println();
         app.startApplication2();
         System.out.println();
         app.startApplication3();
         System.out.println();
         app.startApplication4();
     }
    

    public void startApplication() throws NullNameException 
    { //try{ 
        
        Order order = new Order(new Employee("",""));

        order.addProduct(new Product("Салат Изюминка",35, 100), 2);
        order.addProduct(new Product("Печень по королевски", 54, 150), 2);
        order.addProduct(new Product("Рис отварной с маслом", 16, 170), 1);
        order.addProduct(new Product("Рулет с изюмом", 15, 75), 2);
        order.addProduct(new Product("Салат Лукошко", 40, 100), 1);
        order.addProduct(new Product("Суп куриный с грибами", 34, 250), 2);
        order.addProduct(new Product("Свинина запеченная\"По-гусарски\"", 68, 80), 1);
        order.addProduct(new Product("Макароны отварные", 15, 170), 2);
        order.addProduct(new Product("Пирог с яблоками", 13, 60), 1);
        order.addProduct(new Product("Суп болгарский вегетарианский", 21, 250), 1);
        order.addProduct(new Product("Рыбное филе с помидоркой", 54, 80), 1);
        order.addProduct(new Product("Пирог с повидлом", 13, 60), 2);
        
        System.out.println("Отчёт для столовой:");
        order.showReportForCanteen();

        System.out.println();
    }
    //catch (NullNameException ex){
         
       // System.out.println(ex.getMessage());
    //}
    //}   
    public void startApplication1() 
    {  
        Order order = new Order(new Employee("А", "Пупкин"));
    
        order.addProduct(new Product("Салат Изюминка", 35, 100), 1);
        order.addProduct(new Product("Печень по королевски", 54, 150), 1);
        order.addProduct(new Product("Рис отварной с маслом", 16, 170), 1);
        order.addProduct(new Product("Рулет с изюмом", 15, 75), 1);

        System.out.println();

        System.out.println("Отчёт для раздачи:");
        order.showReportForDistribution();
    }
      
    

       
    
    public void startApplication2() {
        Order order = new Order(new Employee("С", "Кривенко"));

        order.addProduct(new Product("Салат Лукошко", 40, 100), 1);
        order.addProduct(new Product("Суп куриный с грибами", 34, 250), 1);
        order.addProduct(new Product("Свинина запеченная\"По-гусарски\"", 68, 80), 1);
        order.addProduct(new Product("Макароны отварные", 15, 170), 1);
        order.addProduct(new Product("Пирог с яблоками", 13, 60), 1);

        System.out.println();

        System.out.println("Отчёт для раздачи:");
        order.showReportForDistribution();
    }
    
     public void startApplication3() {
        Order order = new Order(new Employee("П", "Гайченов"));

        order.addProduct(new Product("Суп болгарский вегетарианский", 21, 250), 1);
        order.addProduct(new Product("Рыбное филе с помидоркой", 54, 80), 1);
        order.addProduct(new Product("Рулет с изюмом", 15, 75), 1);
        order.addProduct(new Product("Пирог с повидлом", 13, 60), 1);
        System.out.println();

        System.out.println("Отчёт для раздачи:");
        order.showReportForDistribution();
    }
     public void startApplication4() {
        Order order = new Order(new Employee("Л", "Сухожилов"));

        order.addProduct(new Product("Салат Изюминка", 35, 100), 1);
        order.addProduct(new Product("Суп куриный с грибами", 34, 250), 1);
        order.addProduct(new Product("Печень  по королевски", 54, 150), 1);
        order.addProduct(new Product("Макароны отварные", 15, 170), 1);
        order.addProduct(new Product("Пирог с повидлом", 13, 60), 1);

        System.out.println();

        System.out.println("Отчёт для раздачи:");
        order.showReportForDistribution();
     }
}