
package mascotas;


public class Mascotas {
    private String nombre;
    private String especie;
    private int edad;
    
    //Constructor
    public Mascotas (String nombre, String especie, int edad){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Metodo para mostrar información de la mascota
    public void mostrarInfo(){
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su especie es: " + especie);
        System.out.println("Su edad es: " + edad);
    }
    
    //Metodo paso del tiempo
    public void cumplirAnios(){
        edad += 1;
        System.out.println(nombre + " ha cumplido un año más. Ahora tiene " + edad + " años");
    }
    
    
    
    
}
