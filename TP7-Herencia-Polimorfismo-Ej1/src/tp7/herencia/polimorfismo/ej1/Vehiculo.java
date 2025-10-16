
package tp7.herencia.polimorfismo.ej1;


//Clase base Vehiculo
public class Vehiculo {
    private String marca;
    private String modelo;
    
    //Constructor

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    //Getters

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    
    public void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
   
    
}
