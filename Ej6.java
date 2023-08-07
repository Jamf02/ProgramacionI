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
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 /*Leer un número de 3 cifras y luego asignarle a una variable el inverso de dicho número, 
 por ejemplo a = 123 => b = 321. Finalmente mostrar el valor de b.*/
 int a,b,c;
 
 JOptionPane.showMessageDialog(null,"Número de 3 cifras");
 a=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la primera cifra"));
 b=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la segunda cifra"));
 c=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la tercera cifra"));
 JOptionPane.showMessageDialog(null,"el valor invertido es: "+(c)+(b)+(a));
 }

    }
 
    
    

