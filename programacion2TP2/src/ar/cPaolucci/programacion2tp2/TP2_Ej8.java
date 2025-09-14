/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar.cPaolucci.programacion2tp2;

import java.util.Scanner;


public class TP2_Ej8 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precioBase, porcentajeImpuesto, porcentajeDescuento;
        
        
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el porcentaje de impuesto: ");
        porcentajeImpuesto = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el porcentaje de descuento: ");
        porcentajeDescuento = Double.parseDouble(input.nextLine());
        
        double precioFinal = calcularPrecioFinal(precioBase, porcentajeImpuesto, porcentajeDescuento);
        
        System.out.println("El precio final es: $ " + precioFinal);
        
    }// Cierre de Main
    
    static double calcularPrecioFinal(double precioBase, double porcentajeImpuesto, double porcentajeDescuento){
        double impuesto = precioBase * (porcentajeImpuesto / 100);
        double descuento = precioBase * (porcentajeDescuento / 100);
        return precioBase + porcentajeImpuesto - porcentajeDescuento;
    }
    
} //Cierre Clase
