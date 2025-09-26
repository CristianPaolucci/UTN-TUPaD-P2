
package tp5.relaciones_uml.computadora;


public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;
    
    //Composición: el constructor crea el objeto PlacaMadre

    public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modelo, chipset); //Aquí se aplica la composición, se crea internamente
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie + ", placaMadre=" + placaMadre + '}';
    }
    
    //Getters

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }
    
    public void mostrar(){
        System.out.println("Computadora: " + marca + " número de serie: " + numeroSerie + " Placa madre: " + placaMadre.getModelo() + placaMadre.getChipset());
    }
    
    public void setPropietario(Propietario propietario){
        this.propietario = propietario;
        if(propietario != null && propietario.getComputadora() != this){
            propietario.setComputadora(this);
        }
               
    }
    
    
    
}
