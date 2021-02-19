/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoa;

import java.util.Scanner;
/**
 *  It requests by keyboard the hour, minutes and
    seconds of an hour until it is correct and when correct,
    it displays the hour converted to seconds
 * @author Victor Blanco Rodrigo @Vitilio en GitHub
 * @version 1.0
 */
public class ClaseWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
	int n;
        
        System.out.println("Introduzca un numero entero: ");
	n=teclado.nextInt();
                
        while(n>0){
            if (n%2==0){
                System.out.println("PAR");
            }
            else{
                System.out.println("IMPAR");
            }
            System.out.println("Introduzca un numero entero: ");
            n=teclado.nextInt();
        }
    }  
}
