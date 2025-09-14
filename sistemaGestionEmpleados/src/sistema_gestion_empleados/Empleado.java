
package sistema_gestion_empleados;


public class Empleado {
    //Atributos privados
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    

    //Atributo estático
    private static int totalEmpleados = 0;
    private static int ultimoId = 0; //Para generar IDs automáticos
    
    //Constructor Completo
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        
        //Actualizar último Id si el id es mayor
        if(id > ultimoId){
            ultimoId = id;
        }
        
        totalEmpleados ++;
    }
    
    //Constructor parcial con ID automático y salario por defecto
    public Empleado(String nombre, String puesto){
        this.id = ++ultimoId; //ID automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 900000.0; //Salario por defecto
        totalEmpleados ++;
    }

    //Método sobrecargado: actualiza salario con porcentaje
    public void actualizarSalario(double porcentaje){
        if(porcentaje > 0){
            this.salario += this.salario * (porcentaje / 100);
        }
    }
    
    //Método sobrecargado: actualiza salario con cantidad fija
    public void actualizarSalario(int cantidad){
        if(cantidad > 0){
            this.salario += cantidad;
        }
    }
    
    
     // Método toString()
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    //Método estático: muestra total de empleados
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
    
   
    //Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null){
           this.nombre = nombre;  
        }
       
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

   
    
    
}
