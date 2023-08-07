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
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*En una tienda se ha establecido la siguiente oferta: por compras menores a 50 bolivianos se hace un descuento de 8%,
pero para compras a partir de 50 el descuento es de 10%. 
Se pide ingresar la cantidad y el precio del producto que se compra y determinar cuánto se descontará y cuánto se cobrará*/
 JOptionPane.showMessageDialog(null,"Buenas,Productos de la tienda");
 int precio,cantidad;
 double precioS,precioActualS,precioC,precioActualC;
 precio=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el precio del objeto"));
 
 if(precio<50){
     precioS=precio*0.08;
     precioActualS=precio-precioS; 
     cantidad=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad del objeto"));
  JOptionPane.showMessageDialog(null,"El precio final sería: "+(cantidad*precioActualS));
 }  
 else if(precio>=50){
     precioC=precio*0.10;
     precioActualC=precio-precioC;
    cantidad=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad del objeto"));    
  JOptionPane.showMessageDialog(null,"El precio final sería: "+(cantidad*precioActualC));
 }
 
 }
 
    }
    

