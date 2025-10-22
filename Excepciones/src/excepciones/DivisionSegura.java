
package excepciones;

import java.util.Scanner;


public class DivisionSegura {
  
    public static void ejecutar(){
        Scanner scanner = new Scanner(System.in);
        
        try{
            System.out.print("Ingrese el numerador: ");
            int numerador = scanner.nextInt();
            
            System.out.print("Ingrese el denominador: ");
            int denominador = scanner.nextInt();
            
            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
            
        } catch (ArithmeticException e){
            System.out.println("Error: no se puede dividir por cero");
        }
    }
    
}
