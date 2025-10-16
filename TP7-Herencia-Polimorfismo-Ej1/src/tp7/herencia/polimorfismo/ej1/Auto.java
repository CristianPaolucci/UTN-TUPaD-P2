
package tp7.herencia.polimorfismo.ej1;

//Subclase auto que hereda de Vehiculo
public class Auto extends Vehiculo {
    private int cantidadPuertas;
    
// Constructor

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);       // Llamada al constructor
        this.cantidadPuertas = cantidadPuertas;
    }
    // Geeters y Setters para cantidadPuertas

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
        
    }
    
    //Se sobreescribe mostrarInfo() para agregar información de la clase base
    @Override
    public void mostrarInfo(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
    
    }
    
    
}
