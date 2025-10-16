
package tp7.herencia.polimorfismo.ej4;


public class Perro extends Animal {
    
    //Constructor
    public Perro(String nombre) {
        super(nombre);
    }
    
    @Override
    public void hacerSonido(){
        //Acceder el nombre mediante getter
        System.out.println(getNombre() + " emite el sonido: gauu gauu");
    }

    @Override
    public String toString() {
        return "Perro{" + '}';
    }

    
    
    
    
    
    
}
