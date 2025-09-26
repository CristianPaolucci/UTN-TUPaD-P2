/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar.cPaolucci.programacion2tp2;

import java.util.Scanner;


public class TP2_Ej4 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precio, precioFinal;
        double porcentajeDescuento = 0;
        char categoria;
        
        
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese la categoria ('A','B','C'): ");
        
        /*Toma el primer caracter ingresado. Lo convierte a mayúscula si ingresa minúcula. 
        Y quita espacios en blanco al inicio. 
        */
        categoria = Character.toUpperCase(input.nextLine().trim().charAt(0));
        
        
        switch (categoria){
            case 'A' -> porcentajeDescuento = 10;
                
            case 'B' -> porcentajeDescuento = 15;
                
            case 'C' -> porcentajeDescuento = 20;
                
            default -> System.out.println("Categoría no válida. No aplica descuento");
                
        }
        
        //Calcula precio final
        precioFinal = precio - (precio * porcentajeDescuento / 100);
        
        //Mostrar los resultados
        System.out.println("\nPrecio Original: " + precio);
        
        System.out.println("Descuento: " + porcentajeDescuento + "%");
        
        System.out.println("Precio Final: " + precioFinal);
        
        input.close();
        
            
    }     
            
}          
            
            
            
            
        
        
        
     
