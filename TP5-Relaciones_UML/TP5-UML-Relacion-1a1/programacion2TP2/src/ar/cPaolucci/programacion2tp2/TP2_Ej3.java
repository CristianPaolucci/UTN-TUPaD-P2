/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar.cPaolucci.programacion2tp2;

import java.util.Scanner;


public class TP2_Ej3 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad;
        
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        if(edad < 12){
             System.out.println(edad + " Niño");
         }else if(edad < 17){
             System.out.println(edad + " Adolescente"); 
         }else if(edad < 59){
             System.out.println(edad + " Adulto");
         }else{
             System.out.println(" Adulto mayor");
         }
        
        
    }
    
}
