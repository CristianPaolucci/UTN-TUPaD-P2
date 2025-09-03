
package libro;


public class Principal {

    
    public static void main(String[] args) {
       //Se insancia un libro con datos válidos
        Libro libro1 = new Libro("Ficciones", "Jorge Luis Borges", 1944);
        System.out.println("\nInformación de año de publicación del libro");
        libro1.mostrarInfo();
        
        //Intentar modificar el año con un valor inválido
     System.out.println("\nIntentando modificar el año a uno inválido (-10) ");
     libro1.setAnioPublicacion(-10);
     
     //Intentar modificar el año con un valor válido
        System.out.println("\nModificando el año con uno válido (1987)");
        libro1.setAnioPublicacion(1987);
        
     //Mostrar información final
        System.out.println("\nInformación final del año del libro luego del cambio");
        libro1.mostrarInfo();
       
    }
    
     
     
    
    
    
    
}
