
package tp6.casopractico2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Biblioteca {
    private String nombre;
    private List<Libro> libros;
    
    //Constructor

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor){
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }
    public void listarLibros(){
        System.out.println("Libros en la biblioteca " + nombre + ":");
        for (Libro libro : libros){
            libro.mostrarInfo();
        }
    }
    public Libro buscarLibroPorIsbn(String isbn){
        for(Libro libro : libros){
            if (libro.getIsbn().equalsIgnoreCase(isbn)){
                return libro;
            }
        
    }
        return null;
        
    }
    public boolean eliminarLibro(String isbn){
        Libro libro = buscarLibroPorIsbn(isbn);
        if (libro != null){
            libros.remove(libro);
            return true;
        }
        return false;
    }
    public int obtenerCantidadLibros(){
        return libros.size();
    }
    public void filtrarLibrosPorAnio(int anio){
        System.out.println("Libros publicados en el año " + anio + ":");
        for(Libro libro : libros){
            if (libro.getAnioPublicacion() == anio){
                libro.mostrarInfo();
            }
        }
    }
    public void mostrarAutoresDisponibles(){
        Set<String> autoresUnicos = new HashSet();
        for (Libro libro : libros){
            Autor autor = libro.getAutor();
            if (autoresUnicos.add(autor.getNombre())){
                autor.mostrarInfo();
                System.out.println("------------------");
            }
        }
    }
    
}
