
package tp5.relaciones_uml.tarjetadecredito;


public class TP5Relaciones_UMLTarjetaDeCredito {

  
    public static void main(String[] args) {
        Banco banco1 = new Banco("Nación", "12-39876422-0");
        Cliente cliente1 = new Cliente("Juan Perez", "12345765");
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("8765-3625-2521-0097", "12/25", cliente1, banco1);
        
        //Mostrar datos
        System.out.println("Cliente: " + cliente1.getNombre() + " DNI: " + cliente1.getDni());
        System.out.println("Tarjeta: " + tarjeta1.getNumero() + " Vencimiento: " + tarjeta1.getFechaVencimiento());
        System.out.println("Banco: " + banco1.getNombre() + " CUIT: " + banco1.getCuit());
        
        System.out.println("\n\n");
        
        //Verificar referencia cruzada
        System.out.println("Tarjeta cliente: " + cliente1.getTarjetaDeCredito().getNumero());
        System.out.println("Cliente asociado a la tarjeta: " + tarjeta1.getCliente().getNombre());
    }
    
   
    
    
   
    
   
    
}
