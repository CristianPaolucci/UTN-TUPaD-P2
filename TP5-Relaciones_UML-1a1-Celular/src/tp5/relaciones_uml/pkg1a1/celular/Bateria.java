
package tp5.relaciones_uml.pkg1a1.celular;


public class Bateria {
    private String modelo;
    private String capacidad;
    
    //Constructor

    public Bateria(String modelo, String capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Bateria{" + "modelo=" + modelo + ", capacidad=" + capacidad + '}';
    }

    public String getModelo() {
        return modelo;
    }

    public String getCapacidad() {
        return capacidad;
    }
    
    
}
