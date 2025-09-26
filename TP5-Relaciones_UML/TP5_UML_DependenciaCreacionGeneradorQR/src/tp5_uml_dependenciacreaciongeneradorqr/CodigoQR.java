
package tp5_uml_dependenciacreaciongeneradorqr;


public class CodigoQR {
    private String valor;
    private Usuario usuario; //Asociación unidireccional
    
    //Constructor

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "CodigoQR{" + "valor=" + valor + ", usuario=" + usuario + '}';
    }
    //Getters

    public String getValor() {
        return valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    
}
