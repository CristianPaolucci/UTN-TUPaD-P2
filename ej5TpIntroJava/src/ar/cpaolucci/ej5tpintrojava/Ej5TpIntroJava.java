/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar.cpaolucci.ej5tpintrojava;

import java.util.Scanner;


public class Ej5TpIntroJava {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);  //Se crea objeto de tipo Scanner llamado input para obtener valores ingresados por tecladoo
        
        //Se declaran las variables y tipo
        int num1, num2;
        int suma, resta, multiplicacion;
        double division;
        
        //Se solicita a usuario que ingrese dos numeros enteros
        System.out.print("Ingrese el primer número entero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo número entero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        //Se realizan las diferentes operaciones aritmeticas, con casting para la division
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = ((double)num1 / num2);
        
        //Se imprime por pantalla resultados concatenados con literales
        System.out.println("La suma de los numeros ingresados es: " + suma);
        System.out.println("La resta de los numeros ingresados es: " + resta);
        System.out.println("La multiplicación de los numeros ingresados es: " + multiplicacion);
        System.out.println("La división de los numeros ingresados es: " + division);
        
        input.close();  //Se cierra el Scanner
    }
    
}
