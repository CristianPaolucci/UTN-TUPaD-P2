
package tp5relaciones_uml.reserva;


public class TP5Relaciones_UMLReserva {

    
    public static void main(String[] args) {
        //Crear un cliente
        Cliente cliente1 = new Cliente("Manuel Rodas", "1511178234");
        
        //Crear la mesa
        Mesa mesa1 = new Mesa("5", "4 personas");
        
        //Crear reserva usando cliente y mesa
        Reserva reserva1 = new Reserva("1-10", "21:30", cliente1, mesa1);
        
        //Mostrar la reserva
        reserva1.mostrar(); // Usa el método de mostrar
        
        System.out.println("\n");
        
        //Utilizar toString()
        System.out.println(reserva1); //Imprime todos los datos
        
    }
    
}
