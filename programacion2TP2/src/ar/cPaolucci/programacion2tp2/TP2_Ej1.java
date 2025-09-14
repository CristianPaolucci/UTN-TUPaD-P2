/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar.cPaolucci.programacion2tp2;

import java.util.Scanner;   //Se importa el Scanner 


public class TP2_Ej1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Se 
        int anio;
        
        System.out.print("Ingrese el año: ");
        anio = Integer.parseInt(input.nextLine());
        
        if((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)){
            System.out.println(anio + " Es un año bisiesto");
        
        } else{
            System.out.println(anio + " No es un año bisiesto");
        } 
        
    }
    
}
