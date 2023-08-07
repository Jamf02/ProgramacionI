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
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Leer un número entre 1 y 7 y convertirlo en el día de la semana.
JOptionPane.showMessageDialog(null,"Número del 1 al 7");
int resp;
resp=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número"));
switch(resp){
    case 1:
            JOptionPane.showMessageDialog(null,"Lunes");
            break;
    case 2:
            JOptionPane.showMessageDialog(null,"Martes");
            break;
    case 3:
            JOptionPane.showMessageDialog(null,"Miércoles");
            break;
    case 4:
            JOptionPane.showMessageDialog(null,"Jueves");
            break;
    case 5:
           JOptionPane.showMessageDialog(null,"Viernes");
            break;
    case 6:
            JOptionPane.showMessageDialog(null,"Sábado");
            break;
    case 7:
            JOptionPane.showMessageDialog(null,"Domingo");
            break;
    }
    }
}

