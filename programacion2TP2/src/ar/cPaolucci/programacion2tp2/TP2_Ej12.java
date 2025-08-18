/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar.cPaolucci.programacion2tp2;


public class TP2_Ej12 {

    
    public static void main(String[] args) {
        //Declarar e inicializar el array con precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        //Mostrar precios originales
        System.out.println("Precios originales:");
        mostrarPrecios(precios);

        //Modificar el precio del tercer producto (índice 2)
        precios[2] = 129.99;

        //Mostrar precios modificados
        System.out.println("Precios modificados:");
        mostrarPrecios(precios);
    }

    // Método para mostrar los precios del array usando for-each
    public static void mostrarPrecios(double[] array) {
        for (double precio : array) {
            System.out.println("Precio: $" + precio);
        }
    }
}

    
    

