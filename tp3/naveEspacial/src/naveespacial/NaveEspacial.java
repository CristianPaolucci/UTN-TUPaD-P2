
package naveespacial;


public class NaveEspacial {
    // Atributos privaos que representan las propiedades de la nave
    private String nombre; //Nombre de la nave
    private int combustible; // Cantidad actual de combustible disponible
    private int combustibleMaximo; //Capacidad máxima de combustible que puede almacenar la nave
    private boolean despegar; //Estado de la nave: True si ha despegadoo, false si está en tierra
    
    //Constructor de la clase NaveEspacial
    //Inicializada la nave con nombre, combustible inicial y capacidad máxima de combustible
    //La nave inicia en tierra
    public NaveEspacial(String nombre, int combustible, int combustibleMaximo){
        this.nombre = nombre; // Asigna el nombre de la nave
        this.combustible = combustible; // Al inicio, el combustible esta lleno
        this.combustibleMaximo = combustibleMaximo; //Guarda cual es el máximo del combustible permitido
        this.despegar = false; // La nave empieza en tiera, no ha despegado aún
                
    }
    //Método para el despegue de la nave
    //Consume 10 unidades de combustible para el despegue
    //Despega si hay combustible suficiente
    //Cambia el estado de la nave a despegada
    public void despegar(){
        if (combustible >= 10){
            combustible -= 10; //Resta combustible para el despegue
            despegar = true; //Cambia a estado despegada
            System.out.println(nombre + " Ha despegado. Combustible restante: " + combustible);
            
                    
        }else{
            System.out.println("\"No hay combustible suficiente para el despegue. Cobustible actual: " + combustible);
            
           
        }
        
    
}   // Método para avanzar la nave una cierta distancia
    //Cada Km consume 2 unidades de combustible
    //Solo avanza si ha despegado y tiene combustible suficiente
    public void avanzar (int distancia){
        int consumo = distancia * 2; // Calcula consumo según distancia
        
        if (!despegar){
            System.out.println(nombre + " no puede avanzar, aún no ha despegado");
            return; // Termina el método si la nave no despega. este return esta dentro del if, distinto al return que devuelve algo 
        }
        if (combustible >= consumo){
            combustible -= consumo; //Consume combustible según distancia
            System.out.println(nombre + " ha avanzado" + distancia + " km. combustible restante: " + combustible);
            
            
        }else{
            System.out.println("No hay combustible suficiente para avanzar " + distancia + "Km " +
                    "Necesario " + consumo + " disponible " + combustible);
            
        }
                
    }
    
    public void recargarCombustible(int cantidad){
        if (cantidad <= 0){
            System.out.println("Cantidad invalida");
            return; //Para terminar este return, no porque devuelve algo, esta dentro del if
            
        }
        
        if (combustible + cantidad > combustibleMaximo){
            combustible = combustibleMaximo; //Llena el máximo pemitido
            System.out.println("Combustible recargado hasta el máximo (" + combustibleMaximo + ").");
            
            
        }else{
            combustible += cantidad; // Suma la cantidad al combustible actual
            System.out.println("Combustible recargado en " + cantidad + " Total: " + combustible);
        }
        
    }
    
    //Método para mostrar el estado actual de la nave
    //Imprime nombre, estado (tierra o despegada) y nivel de combustible
    public void mostrarEstado(){
        String estado = despegar? "La nave despegó" : "La nave está en tierra";
        System.out.println("\n Estado de la nave");
        System.out.println("Nombre: " + nombre);
        System.out.println("Estado: " + estado);
        System.out.println("Combustible: " + combustible + "/" + combustibleMaximo);
        
        
    }
    
    
}
    

