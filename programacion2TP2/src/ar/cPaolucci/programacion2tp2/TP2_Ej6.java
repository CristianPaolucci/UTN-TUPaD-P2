/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar.cPaolucci.programacion2tp2;

import java.util.Scanner;


public class TP2_Ej6 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, positivos = 0, negativos = 0, cero = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número entero: ");
            num = Integer.parseInt(input.nextLine());
            
            if (num > 0){
                positivos += 1;
            }else if (num < 0){
                negativos += 1;
            }else{
                cero += 1;
            }
        }
        System.out.println("\n Resultados");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos" + negativos);
        System.out.println("Ceros: " + cero);
        
    }
    
}
