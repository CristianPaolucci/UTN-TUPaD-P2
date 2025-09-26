
package tp5.relaciones_uml.computadora;


public class TP5Relaciones_UMLComputadora {

   
    public static void main(String[] args) {
        //Crear la computadora, instanciar
        Computadora computadora1 = new Computadora("Windows", "1123-00-a2", "Windows 11", "AMD X570");
        //Crear el propietario, instanciar
        Propietario propietario1 = new Propietario("Silvina Contreras", "39123089");
        
        //Establecer la relación entre propietario y computadora
        propietario1.setComputadora(computadora1);
        
        //Mostrar información
        computadora1.mostrar();
        System.out.println("Propietario: " + computadora1.getPropietario().getNombre() + " DNI: " + computadora1.getPropietario().getDni());
        
        
    }
    
}
