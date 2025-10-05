
package tp6.casopractico2;


public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;
    
    //Constructor

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor{" + "id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }
    public void mostrarInfo(){
        System.out.println("Autor: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Nacionalidad: " + nacionalidad);
    }
    public String getNombre(){
    return nombre;
}
}
