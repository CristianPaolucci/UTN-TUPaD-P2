
package tp5.relaciones_uml.tarjetadecredito;


public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjetaDeCredito;
    
    //Constructor

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + ", tarjetaDeCredito=" + tarjetaDeCredito + '}';
    }
    
    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito){
        this.tarjetaDeCredito = tarjetaDeCredito;
        if(tarjetaDeCredito != null && tarjetaDeCredito.getCliente() != this){
            tarjetaDeCredito.setCliente(this);
        }
    }
    
    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }

   
    
}
