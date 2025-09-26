
package tp5.relaciones_uml.libro;


//Clase Libro: asocia Autor (asociación unidireccional) y agrega Editorial(agregación)
public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;  // Asociación unidireccional
    private Editorial editorial;  // Agregación
    
    //Constructor

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
    
    //Getters

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }
    

    
    
    
    
}
