
package excepciones;

import java.util.Scanner;


public class Excepciones {

 
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int opcion;
        
        do {
            System.out.println("\n---NUMERO DE EJERCICIOS DE EXCEPCIONES---");  
            System.out.println("1. División segura");
            System.out.println("2. Conversión de cadena a número");
            System.out.println("3. Lectura de archivo");
            System.out.println("4. Validar edad (excepción personalizada)");
            System.out.println("5. Lectura con BufferedReader (try-with-resources)");
            System.out.println("0. Salir");
            System.out.println("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion){
                case 1:
                    DivisionSegura.ejecutar();
                    break;
                    
                case 2:
                    ConversionCadenaNumero.ejecutar();
                    break;
                    
                case 3:
                    LecturaArchivo.ejecutar();
                    break;
                    
                case 4:
                    ValidarEdad.ejecutar();
                    break;
                    
                case 5:
                    LecturaConBufferedReader.ejecutar();
                    break;
                    
                case 0:
                    System.out.println("Programa finalizado");
                    break;
                    
                default:
                    System.out.println("Opción inválida");
            }
                    
        } while (opcion != 0);
        
        scanner.close();
        
        
    }
    
}
