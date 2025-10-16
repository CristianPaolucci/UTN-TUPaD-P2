
package tp7.herencia.polimorfismo.ej4;


//Suclase gato
public class Gato extends Animal{
    
     //Constructor
    public Gato(String nombre) {
        super(nombre);
    }
    @Override
    public void hacerSonido(){
        System.out.println(getNombre() + " emite el sonido: miau miau");
    }

    @Override
    public String toString() {
        return "Gato{" + '}';
    }
   
    
}
