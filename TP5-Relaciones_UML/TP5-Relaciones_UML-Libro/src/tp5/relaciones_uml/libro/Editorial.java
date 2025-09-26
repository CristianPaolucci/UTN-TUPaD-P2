
package tp5.relaciones_uml.libro;


//Clase Editorial: es agregada al Libro (agregación)
public class Editorial {
    private String nombre;
    private String direccion;

    //Constructor
    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", direccion=" + direccion + '}';
    }
    
    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
    
    
}
