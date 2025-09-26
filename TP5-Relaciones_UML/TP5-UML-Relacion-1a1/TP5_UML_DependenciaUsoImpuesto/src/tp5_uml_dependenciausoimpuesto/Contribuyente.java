
package tp5_uml_dependenciausoimpuesto;


public class Contribuyente {
    private String nombre;
    private String cuit;
    
    //Constructor

    public Contribuyente(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return "Contribuyente{" + "nombre=" + nombre + ", cuit=" + cuit + '}';
    }
    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getCuit() {
        return cuit;
    }
    
    
}
