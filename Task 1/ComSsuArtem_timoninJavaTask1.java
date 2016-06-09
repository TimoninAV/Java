/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ssu.artem_timonin.java.task1;

/**
 *
 * @author ARTEM
 */
public class ComSsuArtem_timoninJavaTask1
{

 /**
     * @param args the command line arguments
     */public static void Sort(int[] arr)
     {
    /*По очереди будем просматривать все подмножества
      элементов массива (0 - последний, 1-последний, 
      2-последний,...)*/
         for (int i = 0; i < arr.length; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
        int min = arr[i];
        int min_i = i; 
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
        for (int j = i+1; j < arr.length; j++) {
            //Если находим, запоминаем его индекс
            if (arr[j] < min) {
                min = arr[j];
                min_i = j;
            }
        }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
        if (i != min_i) {
            int tmp = arr[i];
            arr[i] = arr[min_i];
            arr[min_i] = tmp;
        }
     }
     }
    public static void main(String[] args) 
    {
        System.out.print("\n");
         int arr[] ={150, 884, 32, -5, 0, -214, 82, 102, 8, 71};
Sort(arr);
for(int i = 0; i <  arr.length; i++) 
{
	System.out.print(arr[i] + "  ");
}
    }
    

}