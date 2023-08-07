/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea_programacion;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Generar los primeros n elementos de la serie de Fibonacci: 0 1 1 2 3 5 8 13 21 ... 
     Scanner teclado= new Scanner(System.in);
     int a=0,b=1,c,n;
     System.out.println("Ingrese la cantidad de elementos para la serie");
     n=teclado.nextInt();
     for(int i=0;i<n;i++){
       System.out.println(a);
       c=a+b;
       a=b;
       b=c;
    }
    
}
}