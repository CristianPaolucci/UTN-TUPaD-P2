
package tp5relaciones_uml_citamedica;


public class Paciente {
    private String nombre;
    private String obraSocial;
    
    //Constructor

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", obraSocial=" + obraSocial + '}';
    }
    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getObraSocial() {
        return obraSocial;
    }
    
    
}
