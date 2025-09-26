
package tp5relaciones_uml_documento;


public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;
    
    //Constructor

    public Documento(String titulo, String contenido, FirmaDigital firmaDigital) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = firmaDigital;
    }
    public void mostrar(){
        System.out.println("Documento: " + titulo + contenido + " Firma digital: " + firmaDigital.getCodigoHash());
    }

    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + ", firmaDigital=" + firmaDigital + '}';
    }
    
}
