/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea_programacion;
import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Realizar un programa que lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa según el teorema de Pitágoras.
    int cat1, cat2;
    double hip;
       JOptionPane.showMessageDialog(null,"Buenas,en este programa se calcula la hip");
       cat1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca cateto1"));  
       cat2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca cateto2"));
       JOptionPane.showMessageDialog(null,"la hipotenusa es igual a:"+(hip=sqrt((cat1*cat1)+(cat2*cat2))));
       
               
    }
    
}
