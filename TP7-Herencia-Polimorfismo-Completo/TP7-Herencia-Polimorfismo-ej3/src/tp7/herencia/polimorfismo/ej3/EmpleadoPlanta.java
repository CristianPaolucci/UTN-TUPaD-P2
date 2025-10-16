
package tp7.herencia.polimorfismo.ej3;


public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;
    private double bono;
    
    //Costructor

    public EmpleadoPlanta(String nombre, double sueldoBase, double bono) {
        super(nombre); 
        this.sueldoBase = sueldoBase;
        this.bono = bono;
    }
    @Override
    public double calcularSueldo(){
    return sueldoBase + bono;
}

    @Override
    public String toString() {
        return "EmpleadoPlanta{" + "sueldoBase=" + sueldoBase + ", bono=" + bono + '}';
    }
    
    
    
}
