
package tp5.relaciones_uml.libro;


public class TP5Relaciones_UMLLibro {

   
    public static void main(String[] args) {
       Autor autor1 = new Autor("Leopoldo Marechal", "Argentino");
       Editorial editorial1 = new Editorial("Editorial Sudamericana", "Av Belgrano 321");
       Libro libro1 = new Libro("Adan Buenosayres", "84-79564-5454-4", autor1, editorial1);
       
        System.out.println("Libro " + libro1.getTitulo());
        System.out.println(libro1.getAutor());
        System.out.println(libro1.getEditorial());
        
        System.out.println("\n\n");
        
        System.out.println(libro1);
        
    }
    
}
