
package tp7.herencia.polimorfismo.ej2;

//Subclase Circulo
public class Circulo extends Figura {
    private double radio;
    
    //Constructor

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(radio,2);
    }
    //Getter radio

    public double getRadio() {
        return radio;
    }
    
    
}
