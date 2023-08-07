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
public class Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Pedir al usuario una serie de números mayores a cero, luego mostrar (1) la suma total,  (2) el promedio de todos los números,
(3) la cantidad de números impares, (4) cantidad de números pares, (5) promedio de impares y (6) el promedio de pares.*/
JOptionPane.showMessageDialog(null,"Introduce números mayores a cero");
int a,b,c;
a=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer número"));
b=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo número"));
c=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el tercer número"));
JOptionPane.showMessageDialog(null,"La suma total de los números es: "+(a+b+c));
JOptionPane.showMessageDialog(null,"El promedio de los números es: "+((a+b+c)/3));
}
}