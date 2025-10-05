
package tp6.casopractico1;


public class Producto {
    private String id;  //Identificador único del producto
    private String nombre;   //Nombre del producto
    private double precio;  //Precio del producto
    private int cantidad;  //Cantidad en stock
    private CategoriaProducto categoria;  //Categoría del producto
    
    //Constructor

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    //Getters

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }
    
    public void setCantidad(int nuevaCantidad){
        this.cantidad = nuevaCantidad;
    }
    
    public void mostrarInfo(){
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Categoría: " + categoria.getDescripcion());
    
}

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
    
    
    
}
