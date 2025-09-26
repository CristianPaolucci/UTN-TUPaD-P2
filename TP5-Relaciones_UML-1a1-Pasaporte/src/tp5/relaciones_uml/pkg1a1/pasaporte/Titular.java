
package tp5.relaciones_uml.pkg1a1.pasaporte;


public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // Asociacion birideccional El titular tiene un pasaporte
    
    //Constructor

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    public void setPasaporte(Pasaporte pasaporte){
        this.pasaporte = pasaporte;
        if(pasaporte.getTitular() != this){
            pasaporte.setTitular(this);
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + ", pasaporte=" + pasaporte + '}';
    }
    
    
}
