
package tp5.relaciones_uml.pkg1a1.pasaporte;


public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Titular titular; //Asociación Bidireccional
    private Foto foto;
    //Constructor

    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato); //Composición 1 a 1
    }
    
    public void setTitular(Titular titular){
        this.titular = titular;
        if(titular.getPasaporte() != this){
            titular.setPasaporte(this);
        }
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Titular getTitular() {
        return titular;
    }
    
    public Foto getFoto(){
        return foto;
    }
    
    
}
