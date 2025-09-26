
package tp5_uml_dependencia.uso.reproductor;


public class Cancion {
    private String titulo;
    private Artista artista; //Asociación unidireccional:Canción --> Artista
    
    //Constructor

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", artista=" + artista + '}';
    }
    //Getters

    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }
    
}
