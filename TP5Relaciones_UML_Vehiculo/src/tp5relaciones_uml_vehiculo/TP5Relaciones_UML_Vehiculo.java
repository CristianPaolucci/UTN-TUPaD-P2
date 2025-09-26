
package tp5relaciones_uml_vehiculo;


public class TP5Relaciones_UML_Vehiculo {

    
    public static void main(String[] args) {
       //Crear el motor
       Motor motor1 = new Motor("Nafta", "MTR 342");
       
       //Crear conductor
       Conductor conductor1 = new Conductor("Luciano Martinez", "42098165");

       //Crear el vehículo y asignarle el motor
       Vehiculo vehiculo1 = new Vehiculo ("ABC123","Cronos", motor1);
       
       
       
       //Establecer relación entre vehículo y conductor
       conductor1.setVehiculo(vehiculo1);
       
        System.out.println();
        
        vehiculo1.setConductor(conductor1);
        
        System.out.println();
        
        //Mostrar información
        vehiculo1.mostrar();
        System.out.println("Conductor del vehículo: " + vehiculo1.getConductor().getNombre());
       
        System.out.println();
        
        System.out.println(vehiculo1);
        
    }
    
}
