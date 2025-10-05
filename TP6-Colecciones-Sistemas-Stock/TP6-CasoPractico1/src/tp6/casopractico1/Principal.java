
package tp6.casopractico1;


public class Principal {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        
        //1.Crear productos
        Producto p1 = new Producto("A001", "Arroz", 1200, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("E101", "Celular", 250000, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("R501", "Campera", 50000, 20, CategoriaProducto.ROPA);
        Producto p4 = new Producto("H205", "Silla", 15000, 15, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("A002", "Fideos", 1100, 40, CategoriaProducto.ALIMENTOS);
        
        //Agregar productos al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        
        //2.Listar productos
        System.out.println("Listado de productos:");
        inventario.listarProductos();
        
        //3.Buscar por ID
        System.out.println("\n Buscando producto por iD 'E101':");
        Producto buscado = inventario.buscarProductoPorId("E101");
        if (buscado != null) buscado.mostrarInfo();
        
        //4.Filtrar por categoria
        System.out.println("Productos en categoria ALIMENTOS:");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        
        //5.Eliminar produto
        System.out.println("\n Eliminando producto con ID 'R501'");
        inventario.elimnarProducto("R501");
        
        System.out.println("Productos después de eliminar:");
        inventario.listarProductos();
        
        //6.Actualizar Stock
        System.out.println("Actualizando stock de 'A001' a 80 unidades");
        inventario.actualizarStock("A001", 80);
        
        //7.Total de stock
        System.out.println("\n El total de stock disponible: " + inventario.obtenerTotalStock());
        
        //8.Producto con mayor stock
        System.out.println("\n producto con mayor stock:");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();
        
        //9.Filtar productos por precio
        System.out.println("\n Productos entre $1000 y $3000:");
        inventario.filtrarProductosPorPrecio(1000, 3000);
        
        //10 Mostrar categorias
        System.out.println("\nCategorias disponibles:");
        inventario.mostrarCategoriaDisponibles();
        
        
        
    }
    
}
