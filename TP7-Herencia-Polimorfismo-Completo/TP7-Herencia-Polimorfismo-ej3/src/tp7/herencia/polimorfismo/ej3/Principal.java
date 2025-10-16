
package tp7.herencia.polimorfismo.ej3;


public class Principal {

   
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        
        empleados[0] = new EmpleadoPlanta("Ana", 850000, 200000);
        empleados[1] = new EmpleadoTemporal("Carlos", 15, 40000);
        empleados[2] = new EmpleadoPlanta("Silvio", 930000, 34000);
        
        for (Empleado empl : empleados){
            System.out.println(empl);
            System.out.println("Sueldo total: $" + empl.calcularSueldo());
            System.out.println("----------------------------------------");
    

    }
        }
}
