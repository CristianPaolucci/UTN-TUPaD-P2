
package tp5_uml_dependenciacreacioneditorvideo;


public class Proyecto {
    private String nombre;
    private String duracionMin;
    
    //Constructor

    public Proyecto(String nombre, String duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", duracionMin=" + duracionMin + '}';
    }
    
    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getDuracionMin() {
        return duracionMin;
    }
    
    
}
