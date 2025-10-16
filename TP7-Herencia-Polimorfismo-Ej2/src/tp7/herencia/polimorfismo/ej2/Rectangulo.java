
package tp7.herencia.polimorfismo.ej2;

//Subclase Rectangulo
public class Rectangulo extends Figura {
    private double base;
    private double altura;
    
    //Constructor

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea(){
        return base * altura;
    }
    
    // Getters

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    

   
    

    
    
}
