
package ecommerce;


public class TP8InterfacesExcepciones {

    
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan Perez", "juan@email.com");

        Producto prod1 = new Producto("Laptop", 1200.00);
        Producto prod2 = new Producto("Mouse", 25.50);

        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(prod1);
        pedido.agregarProducto(prod2);

        System.out.println("Total del pedido: $" + pedido.calcularTotal());

        // Cambiar estado y notificar
        pedido.cambiarEstado("Enviado");

        // Pagar con tarjeta con descuento
        TarjetaCredito tarjeta = new TarjetaCredito();
        tarjeta.aplicarDescuento(10);
        tarjeta.procesarPago(pedido.calcularTotal());

        // Pagar con PayPal sin descuento
        PayPal paypal = new PayPal();
        paypal.procesarPago(pedido.calcularTotal());
    }
}
       
    
    

