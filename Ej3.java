/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea_programacion;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*Realizar un programa que asigne números aleatorios a 3 variables, muestre los valores iniciales, 
    ordene los valores de mayor a menor intercambiando los valores de las variables y muestre el resultado.*/
    JOptionPane.showMessageDialog(null,"3 números aleatorios y de mayor a menor");
    Random random = new Random();
    int a=random.nextInt(9)+1;
    int b=random.nextInt(9)+1;
    int c=random.nextInt(9)+1;
   if(a>b & b<c){
     System.out.println("El orden de mayor a menor es el siguiente:"+a+" "+b+" "+c);
   } else if(a>c & c>b){
     System.out.println("El orden de mayor a menor es el siguiente:"+a+" "+c+" "+b);
   } else if(b>a & a>c){
     System.out.println("El orden de mayor a menor es el siguiente:"+b+" "+a+" "+c);
   } else if(b>c & c>a){
     System.out.println("El orden de mayor a menor es el siguiente:"+b+" "+c+" "+a);  
   } else if(c>a & a>b){
     System.out.println("El orden de mayor a menor es el siguiente:"+c+" "+a+" "+b);  
   } else if(c>b & b>a)
    System.out.println("El orden de mayor a menor es el siguiente:"+c+" "+b+" "+a);
} 
   
    
}