
package tp5relaciones_uml_vehiculo;


public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;
    
    //Constructor

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", modelo=" + modelo + ", motor=" + motor + '}';
    }
    public void mostrar(){
        System.out.println("El vehículo: " + patente + " y modelo:" + modelo + "Motor: " + motor.getTipo() + motor.getNumeroSerie() );
    }
    
    public void setConductor(Conductor conductor){
        this.conductor = conductor;
        if(conductor != null && conductor.getVehiculo() != this){
            conductor.setVehiculo(this);
        }
    }
    //Getters

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public Conductor getConductor() {
        return conductor;
    }
    
    
}
