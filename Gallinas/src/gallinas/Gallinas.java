
package gallinas;


public class Gallinas {
   //Atributos
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    //Constructor
    public Gallinas (int idGallinas, int edad){
        this.idGallina = idGallinas;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos = 0;
        
    }

    //Getters y Setters
    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    //Metodo poner huevos
    public void ponerHuevos(){
        huevosPuestos ++;
        System.out.println("Gallina " + idGallina + " puso un huevo.");
        
        
        
    }
    
    //Metodo para aumentar la edad
    public void envejecer(){
        edad ++;
        System.out.println("Gallina " + idGallina + " ha envejecido, tiene ahora " + edad + " años");
        
    }
    
    //Metodo para mostrar el estado actual
    public void mostrarEstado(){
        System.out.println("Galllina ID: " + idGallina);
        System.out.println("Edad " + edad + " años");
        System.out.println("Huevos puestos " + huevosPuestos);
    }
    
            
}
