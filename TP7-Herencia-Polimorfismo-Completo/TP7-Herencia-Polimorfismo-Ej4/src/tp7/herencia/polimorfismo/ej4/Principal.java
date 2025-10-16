
package tp7.herencia.polimorfismo.ej4;

import java.util.ArrayList;
import java.util.List;


public class Principal {

   
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro ("Manchado"));
        animales.add(new Gato ("Dalí"));
        animales.add(new Vaca ("Lola"));
        
        for (Animal a : animales){
            a.describirAnimal();
            a.hacerSonido();
            System.out.println("--------------------");
        }
        
    }
    
}
