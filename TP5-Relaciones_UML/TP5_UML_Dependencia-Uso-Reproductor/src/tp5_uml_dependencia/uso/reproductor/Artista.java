
package tp5_uml_dependencia.uso.reproductor;


public class Artista {
    private String nombre;
    private String genero;
    
    //Constructor

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }
    //Getter

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }
    
}
