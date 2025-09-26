
package tp5relaciones_uml_documento;


public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario;
    
    //Constructor

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "FirmaDigital{" + "codigoHash=" + codigoHash + ", fecha=" + fecha + ", usuario=" + usuario + '}';
    }

   

   
    //Getters

    public String getCodigoHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void mostrar(){
        System.out.println("La firma digital: " + codigoHash + " Fecha:" + fecha + " Usuario:" + usuario.getNombre());
    }
}
