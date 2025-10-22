
package excepciones;

import java.util.Scanner;


public class ConversionCadenaNumero {
    public static void ejecutar(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        String entrada = scanner.nextLine();
        
        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Número ingresado: " + numero);
            
        } catch (NumberFormatException e){
            System.out.println("Error: Entrada inválida. No es un número entero");
        }
        
    }
    
}
