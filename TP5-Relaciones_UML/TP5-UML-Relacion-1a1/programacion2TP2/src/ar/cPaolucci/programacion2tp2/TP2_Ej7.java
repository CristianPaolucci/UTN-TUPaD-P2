/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar.cPaolucci.programacion2tp2;

import java.util.Scanner;


public class TP2_Ej7 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota;
        
        do{
            System.out.print("Ingrese una nota ( entre 0 y 10): ");
            nota = Integer.parseInt(input.nextLine());
            
            if (nota < 0 || nota > 10){
                System.out.println("Error: Nota inválida.Ingrese una nota entre 0 y 10");
            }
            
            
        }while(nota < 0 || nota > 10);
        
        System.out.println(nota + " Nota guardada");
        
        input.close();
    }
    
}
