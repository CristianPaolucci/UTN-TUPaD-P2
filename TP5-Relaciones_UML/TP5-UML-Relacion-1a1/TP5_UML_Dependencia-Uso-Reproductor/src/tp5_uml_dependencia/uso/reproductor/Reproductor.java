
package tp5_uml_dependencia.uso.reproductor;


public class Reproductor {
    public void reproducir(Cancion cancion){
        System.out.println("Reproduciendo " + cancion.getTitulo());
        System.out.println("Artista: " + cancion.getArtista().getNombre());
        System.out.println("Genero: " + cancion.getArtista().getGenero());
    }
    
}
