
package tp5relaciones_uml_vehiculo;


public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;
    
    //Constructor

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    @Override
    public String toString() {
        return "Conductor{" + "nombre=" + nombre + ", licencia=" + licencia + ", vehiculo=" + vehiculo + '}';
    }
    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
        if (vehiculo != null && vehiculo.getConductor() != this){
            vehiculo.setConductor(this);
        }
    }
    //getters

    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    
    
}
