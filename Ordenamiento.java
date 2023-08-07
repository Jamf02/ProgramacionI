/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ordenamientoburbuja;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ordenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis(); 
        Random numAzar = new Random();
        Scanner key = new Scanner(System.in);
        int tam,num;
        //ingresar el tamaño del arreglo
        System.out.println("Ingrese Tamaño");
        tam=key.nextInt();
        int A[]=new int[tam];
         for(int i=0; i<A.length; i++){ 
            num= (int)(numAzar.nextDouble()*100);
            A[i]=num;
         }
            System.out.println("desordenado: "); 
        for(int i=0; i<A.length; i++) 
            System.out.print( A[i]+" " ); 
        int aux; 
        for(int i=1; i<=A.length; i++) { 
            for(int j=0; j<A.length-i; j++) { 
                if( A[j] > A[j+1] ) { 
                    aux   = A[j]; 
                    A[j]  = A[j+1]; 
                    A[j+1]= aux; 
                }    
            } 
        }

        System.out.println("\nordenado: "); 
        for(int i=0; i<A.length; i++) 
            System.out.print( A[i]+" " );
        long fin = System.currentTimeMillis();
        double tiempo = (double) ((fin-inicio)/1000);
        System.out.println("\n"+tiempo+" segundos");
        
    }
}

    
    

