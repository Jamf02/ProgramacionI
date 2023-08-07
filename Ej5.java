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
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Leer un número e indicar si es positivo o negativo y si es par o impar.
JOptionPane.showMessageDialog(null,"Números");
int num;
num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un valor"));
if(num>0){
   if (num%2==0)
       JOptionPane.showMessageDialog(null,"es positivo y es par");
   else
       JOptionPane.showMessageDialog(null,"es positivo y es impar");
  }
else if (num<0){
    if (num%2==0)
       JOptionPane.showMessageDialog(null,"es negativo y es par");
   else
       JOptionPane.showMessageDialog(null,"es negativo y es impar");
}
}
}