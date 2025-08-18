/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar.cPaolucci.programacion2tp2;

import java.util.Scanner;


public class TP2_Ej11 {
    
    //Variable global para el porcentaje de descuento especial
    static double entrada_salida = 0.10;

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precio;
        
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        
        calcularDescuentoEspecial(precio);
        
        input.close();
        
        
        
    } //Cierre de Main
    
    //Metodo que usa la variable global y muestra resultado
    static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio * entrada_salida;
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
        
    }
    
} // Cierre de clase
