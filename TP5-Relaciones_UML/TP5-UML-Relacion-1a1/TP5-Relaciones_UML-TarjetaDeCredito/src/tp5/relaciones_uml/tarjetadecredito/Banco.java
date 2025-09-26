
package tp5.relaciones_uml.tarjetadecredito;


//Clase Banco:entidad independiente
public class Banco {
    private String nombre;
    private String cuit;
    
    //Constructor

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", cuit=" + cuit + '}';
    }
    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getCuit() {
        return cuit;
    }
    
    
}
