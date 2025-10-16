
package tp7.herencia.polimorfismo.ej3;


public class EmpleadoTemporal extends Empleado {
    private int diasTrabajados;
    private double pagoPorDia;
    
    //Constructor

    public EmpleadoTemporal(String nombre, int diasTrabajados, double pagoPorDia) {
        super(nombre);
        this.diasTrabajados = diasTrabajados;
        this.pagoPorDia = pagoPorDia;
    }
    @Override
    public double calcularSueldo(){
        return diasTrabajados + pagoPorDia;
    }

    @Override
    public String toString() {
        return "EmpleadoTemporal{" + "diasTrabajados=" + diasTrabajados + ", pagoPorDia=" + pagoPorDia + '}';
    }
    
    
}
