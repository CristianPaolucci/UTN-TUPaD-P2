
package tp5relaciones_uml.reserva;


public class Cliente {
    private String nombre;
    private String telefono;
    
    //Constructor

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
    
}
