
package tp5relaciones_uml.reserva;


public class Mesa {
    private String numero;
    private String capacidad;
    
    //Constructor

    public Mesa(String numero, String capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Mesa{" + "numero=" + numero + ", capacidad=" + capacidad + '}';
    }
    //Getters

    public String getNumero() {
        return numero;
    }

    public String getCapacidad() {
        return capacidad;
    }
    
    
}
