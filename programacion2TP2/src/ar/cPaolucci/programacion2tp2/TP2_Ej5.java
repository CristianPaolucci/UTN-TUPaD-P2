/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar.cPaolucci.programacion2tp2;

import java.util.Scanner;


public class TP2_Ej5 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int suma = 0;
        do { 
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = Integer.parseInt(input.nextLine());
            suma += numero;
            
            }while(numero !=0);
        
        System.out.println("La suma total es: " + suma);
            
     
        input.close();
    
        
    }
    
}
