
package estudiantes;


public class Estudiantes {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    //Constructor
    public Estudiantes(String nombre, String apellido, String curso, double calificacion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
        
    
}
    //Mostrar información del estudiante
    public void mostraInfo(){
        System.out.println("Estudiante: " + nombre + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }
    
    //Aumentar la calificación
    public void subirCalificacion(double puntos){
        if (puntos<= 0){
            System.out.println("Los puntos para subir la calificación deben ser mayores a 0");
            return;
        }
        calificacion += puntos;
        if (calificacion > 100){
            calificacion = 100;
        }
        System.out.println("Calificación aumentada. Nueva calificación: " + calificacion);
        
    }
    
    //Disminuir la calificación
    public void bajarCalificacion(double puntos){
        if(calificacion <= 0){
            System.out.println("Los puntos para bajar la calificación deben ser mayores a 0");
            return;
        }
        calificacion -= puntos;
        if(calificacion < 0){
            calificacion = 0;
        }
        System.out.println("Calificación disminuida. Nueva calificación: " + calificacion);
    }
    
}
