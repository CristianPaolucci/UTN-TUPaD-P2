
package sistema_gestion_empleados;


public class Principal {

   
    public static void main(String[] args) {
        //Crear empleados con ambos constructores
        Empleado empleado1 = new Empleado(01, "Lucas Venturinni", "Programador", 1200000);
        Empleado empleado2 = new Empleado("Mariana Gonzalez", "Tester");
        Empleado empleado3 = new Empleado("Javier Torres", "Analista");
        
        
        //Imprimir empleados antes del cambio
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        
        System.out.println("\n\n"); // dos saltos de línea
         
         //Aplicar actualizaciones de salario
        empleado1.actualizarSalario(15.0); //15% aumento
        empleado3.actualizarSalario(350000); //$350000 aumento
        
        //Imprimir empleados
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        
        //Mostra total empleados
        System.out.println("El total de empleados es: " + Empleado.mostrarTotalEmpleados());
    }
    
}
