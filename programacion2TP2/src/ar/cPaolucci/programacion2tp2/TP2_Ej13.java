/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar.cPaolucci.programacion2tp2;


public class TP2_Ej13 {

    
    public static void main(String[] args) {
        // Declarar e inicializar el array con precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // Mostrar precios originales usando función recursiva
        System.out.println("Precios originales:");
        imprimirRecursivo(precios, 0);

        // Modificar el precio del tercer producto (índice 2)
        precios[2] = 129.99;

        // Mostrar precios modificados usando otra función recursiva
        System.out.println("Precios modificados:");
        imprimirRecursivo(precios, 0);
    }

    // Función recursiva para imprimir los precios desde un índice dado
    public static void imprimirRecursivo(double[] array, int indice) {
        if (indice < array.length) {
            System.out.println("Precio: $" + array[indice]);
            imprimirRecursivo(array, indice + 1); // llamada recursiva al siguiente índice
        }
    }
}
    
    

