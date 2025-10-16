
package tp7.herencia.polimorfismo.ej3;


/**
 * Clase base abstracta que representa un empleado genérico
 * Define el nombre y el método abstracto calcularSueldo()
*/
public abstract class Empleado {
    private String nombre;

    //Constructor
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    
    //Getters
    public String getNombre() {
        return nombre;
    }

    // Método abstracto: solo la firma, sin cuerpo
    public abstract double calcularSueldo();

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + '}';
    }
}

