
package mascotas;

import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nombre;
        String especie;
        int edad;
         
        //Pedir datos al usuario
        System.out.print("Ingrese el nombre de la mascota: ");
        nombre = input.nextLine();
        
        System.out.print("Ingrese la especie de la mascota: ");
        especie = input.nextLine();
        
        System.out.print("Ingrese la edad de la mascota: ");
        edad = Integer.parseInt(input.nextLine());
        
        //Se instancia objeto mascota
        Mascotas miMascota = new Mascotas(nombre, especie, edad);
        
        //Mostrar información inicial
        System.out.println("Información inicial de la mascota: ");
        miMascota.mostrarInfo();
        
        //Simular el paso del tiempo
        System.out.println("\nSimulando el paso del tiempo");
        miMascota.cumplirAnios();
        
        //Mostrar información actualizada
        System.out.println("\nInformación actualizada de la mascota: ");
        miMascota.mostrarInfo();
        
    }
    
}
