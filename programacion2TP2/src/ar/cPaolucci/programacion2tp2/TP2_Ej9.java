/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar.cPaolucci.programacion2tp2;

import java.util.Scanner;


public class TP2_Ej9 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double peso, precioProducto;
        String zonaEnvio;
        
        
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        zonaEnvio = input.nextLine().toLowerCase();
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        peso = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        
        double envio = calcularCostoEnvio(peso, zonaEnvio);
        
        System.out.println("\nEl precio del producto: $ " + precioProducto);
        System.out.println("El costo de envio es: $ " + envio);
        System.out.println("El precio total a pagar: $ " + (precioProducto + envio));
        
        input.close();
    
    } //Cierre de Main
    
    static double calcularCostoEnvio(double peso, String zona){
        double costo = 0;
        
        if (zona.equals("nacional")){
            costo = peso * 5;  //Costo envío 'nacional' $5 por kg
        }else if (zona.equals("internacional")){
            costo = peso * 10;   //Costo envío 'internacional' $10 por kg
        }else{
            System.out.println("Zona invalida");
        }
        return costo;
        
    }
    
    
} // Cierre de Clase
