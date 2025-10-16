
package tp7.herencia.polimorfismo.ej4;


//Clase abstracta animal
public abstract class Animal {
    private String nombre;
    
    //Constructor

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    //Getters para subclases

    public String getNombre() {
        return nombre;
    }
    
    // Método abstracto para que cada animal sobreescriba
    public abstract void hacerSonido();
    
    //Método concreto
    public void describirAnimal(){
        System.out.println("Este es un animal llamdo " + nombre);
    }
    
    
}
