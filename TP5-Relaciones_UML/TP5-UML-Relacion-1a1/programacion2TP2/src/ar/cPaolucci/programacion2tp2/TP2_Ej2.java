/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar.cPaolucci.programacion2tp2;

import java.util.Scanner;


public class TP2_Ej2 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.print("Ingrese el primer número: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo número: ");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el tercer número: ");
        num3 = Integer.parseInt(input.nextLine());
        
        if(num1 > num2 && num1 > num3){
            System.out.println("El número mayor ingresado es: " + num1);
           
        } else if (num2 > num1 && num2 > num3){
            System.out.println("El número mayor es: " + num2);
        } else{
            System.out.println("El número mayor es: " + num3);
        }
        
        input.close();
                
    }
    
}
