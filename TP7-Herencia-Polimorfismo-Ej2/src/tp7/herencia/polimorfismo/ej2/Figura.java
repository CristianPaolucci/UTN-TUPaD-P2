
package tp7.herencia.polimorfismo.ej2;

//Clase abstracta
public abstract class Figura {
    private String nombre;
    
    //Constructor

    public Figura(String nombre) {
        this.nombre = nombre;
    }

   //Getters

    public String getNombre() {
        return nombre;
    }
    
    //Método abstracto (no tiene cuerpo)
    public abstract double calcularArea();
    
}
