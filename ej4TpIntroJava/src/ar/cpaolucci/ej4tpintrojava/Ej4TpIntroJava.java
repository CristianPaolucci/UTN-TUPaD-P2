/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar.cpaolucci.ej4tpintrojava;

import java.util.Scanner;  //Se importa Scanner


public class Ej4TpIntroJava {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);  //Se crea objeto de tipo Scanner llamado input para obtener valores ingresados por tecladoo
       
       //se declaran variables y tipo
       String nombre;
       int edad;
       
       //Se solicita el ingreso de nombre y edad a usuario 
       System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        //Se imprime resultados concatenando con literales
        System.out.println("Su nombre es " + nombre + " y su edad es de " + edad + " años");
        
        input.close();  //Se cierra el Scanner
    }
    
}
