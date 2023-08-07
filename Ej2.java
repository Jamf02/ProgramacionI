/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea_programacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Calcular el volumen de una esfera
    int r;
    double V;
    JOptionPane.showMessageDialog(null,"Este Programa esta hecho para hallar el volúmen de una esfera 4/3*pi*r");
    r=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el radio"));
    double z=1.33333;
    double n=3.14;
    JOptionPane.showMessageDialog(null,"El volúmen es:"+(V=z*n*(r*r*r)));
    
    }
    
}
