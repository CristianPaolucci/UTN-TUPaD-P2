
package tp5.relaciones_uml.tarjetadecredito;


public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco; //Agregación: Tarjeta tiene un banco, pero banco puede existir solo

    //Constructor
    public TarjetaDeCredito(String numero, String fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
        setCliente(cliente); // Esto establece correctamente la relación
        
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + ", cliente=" + cliente + '}';
    }
    
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjetaDeCredito() != this){
            cliente.setTarjetaDeCredito(this);
        }
    }
    
    //Getters

    public String getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Banco getBanco() {
        return banco;
    }
    
    
}
