
package tp5relaciones_uml_cuentabancaria;


public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuentaBancaria;

    //Constructor

    public Titular(String nombre, String dni, CuentaBancaria cuentaBancaria) {
        this.nombre = nombre;
        this.dni = dni;
        this.cuentaBancaria = cuentaBancaria;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
    
    
    
    public void setCuentaBancaria(CuentaBancaria cuentaBancaria){
        this.cuentaBancaria = cuentaBancaria;
        if(cuentaBancaria != null && cuentaBancaria.getTitular() != this){
            cuentaBancaria.setTitular(this);
        }
    }
    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }
    
    
}
