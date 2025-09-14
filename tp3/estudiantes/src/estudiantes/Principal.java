
package estudiantes;


public class Principal {

 
    public static void main(String[] args) {
       Estudiantes estudiante1 = new Estudiantes("María", "García", "Programación", 68);
       
       //Mostrar información inicial
       estudiante1.mostraInfo();
       
       //Subir la calificación 
       estudiante1.subirCalificacion(22);
       
       //Bajar la calificación
       estudiante1.bajarCalificacion(30);
       
       //Mostrar información final
       estudiante1.mostraInfo();
    }
    
}
