
package tp5.relaciones_uml.libro;


//Clase Autor: no tiene referencias a otras clases
public class Autor {
    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", naciaonalidad=" + nacionalidad + '}';
    }
    
    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    
    
}
