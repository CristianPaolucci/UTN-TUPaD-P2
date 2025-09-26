
package tp5.relaciones_uml.pkg1a1.celular;


public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; // Agregación 1:1
    private Usuario usuario; //Asociación bidireccional
    
    //Constructor

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria; 
        
    }

    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + ", usuario=" + usuario + '}';
    }
    
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
        if(usuario != null && usuario.getCelular() != this){
            usuario.setCelular(this);
        }
        
        
    
    
    }

    public String getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

   

    

    

   
    
}
