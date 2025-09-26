
package tp5_uml_dependencia.uso.reproductor;


public class TP5_UML_DependenciaUsoReproductor {


    public static void main(String[] args) {
        Artista artista1 = new Artista("Bob Dylan", "Folk");
        Cancion cancion1 = new Cancion("Freewheelin", artista1);
        
        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion1); //Acá se da la dependencia de uso
        
    }
    
}
