
package tp6.casopractico2;


public class Principal {

  
    public static void main(String[] args) {
        //1.Se crea la biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Principal");
        
        
        //2.crear autores
        Autor autor1 = new Autor("A001", "Gabriel García Marquez", "Colombiano");
        Autor autor2 = new Autor("A002", "Jorge Luis Borges", "Argentino");
        Autor autor3 = new Autor("A003", "Carlos Fuentes", "Mejicano");
        
        //3. Agregar 5 libros
        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN002", "Fervor de Buenos Aires", 1923, autor2);
        biblioteca.agregarLibro("ISBN002", "Ficciones", 1944, autor2);
        biblioteca.agregarLibro("ISBN003", "La silla del águila", 2003, autor3);
        biblioteca.agregarLibro("ISBN001", "Relato de un naúfrago", 1955, autor1);
        
        //4.Listar todos los libros
        biblioteca.listarLibros();
        
        //5.Buscar libro por ISBN
        System.out.println("Buscar por ISBN: ISBN003");
        Libro buscado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (buscado != null){
            buscado.mostrarInfo();
        }else{
            System.out.println("Libro no encontrado");
        }
        //6.Filtrar por año
        System.out.println("Libros publicados en 1923:");
        biblioteca.filtrarLibrosPorAnio(1923);
        
        //7.Eliminar un libro y listar restantes
        System.out.println("Eliminando libro con ISBN003");
        biblioteca.eliminarLibro("ISBN003");
        biblioteca.listarLibros();
        
        //8.Mostrar total de libros
        System.out.println("Total de libros en la biblioteca " + biblioteca.obtenerCantidadLibros());
        
        //9.Mostrar autores disponibles
        System.out.println("Autores disponibles: ");
        biblioteca.mostrarAutoresDisponibles();
    }
    
    
    
}
