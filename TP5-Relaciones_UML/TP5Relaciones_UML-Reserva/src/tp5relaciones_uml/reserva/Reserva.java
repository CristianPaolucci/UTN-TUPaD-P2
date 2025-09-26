
package tp5relaciones_uml.reserva;


public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente;
    private Mesa mesa;
    
    //Constructor

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "Reserva{" + "fecha=" + fecha + ", hora=" + hora + ", cliente=" + cliente + ", mesa=" + mesa + '}';
    }

    
   
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public void mostrar(){
        System.out.println("Reserva: " + fecha + " para la hora: " + hora + "Cliente: " + cliente.getNombre());
    }
    
}
