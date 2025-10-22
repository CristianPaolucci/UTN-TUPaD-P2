
package ecommerce;

import java.util.ArrayList;
import java.util.List;


public class Pedido implements Pagable {
    private List<Producto> productos;
    private String estado;
    private Cliente cliente;
    
    //Constructor

    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.estado = "Pendiente";
    }
    
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        if (cliente != null) {
            cliente.notificar("El estado del pedido ha cambiado a: " + nuevoEstado);
        }
    }

    public String getEstado() {
        return estado;
    }
   
    
}
