/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar.cpaolucci.ej8tpintrojava;

import java.util.Scanner;


public class Ej8TpIntroJava {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   //Se crea objeto de tipo Scanner llamado input para obtener valores ingresados por tecladoo
        
        //Declaracion de tipo de variable
        int num1, num2, divisionEntera;   
        double divisionDecimal;
        
        //Se solicita ingreso al usuario de dos numeros
        System.out.print("Ingrese el primer número: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo número: ");
        num2 = Integer.parseInt(input.nextLine());
        
        //Se realiza division entera y division con casting
        divisionEntera = num1 / num2;
        divisionDecimal = (double)num1 / num2;
        
        //Salida de resultados concatenados con literales
        System.out.println("El resultado de la división entera es: " + divisionEntera);
        System.out.println("El resultado de la división decimal es: " + divisionDecimal);
        
        input.close();  //Se cierra el Scanner
       
    }
    
}
