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
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Indicar si un número es primo.
JOptionPane.showMessageDialog(null,"Primo o no");
int a,i,numero;
a=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
Scanner lector=new Scanner(System.in);
numero=lector.nextInt();
for(i=1;i<=numero;i++){
    if(numero%i==0){
      a++;
    }
}
if(a==2){
  JOptionPane.showMessageDialog(null,"No es primo");
}else
   JOptionPane.showMessageDialog(null,"Es primo");
}
    
}
    
    

