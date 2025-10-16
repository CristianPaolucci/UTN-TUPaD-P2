
package tp7.herencia.polimorfismo.ej4;


public class Vaca extends Animal {
    
    //Constructor
    public Vaca(String nombre) {
        super(nombre);
    }
    @Override
    public void hacerSonido(){
        System.out.println(getNombre() + " emite el sonido muu muuu");
    }

    @Override
    public String toString() {
        return "Vaca{" + '}';
    }
    
    
    
}
