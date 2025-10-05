
package tp6.casopractico3;


public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;
    
    //Constructor

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        
     }
    
    public void setProfesor (Profesor profesor){
        if (this.profesor == profesor) return;
        
        if (this.profesor != null){
            this.profesor.eliminarCurso(this);
        }
        this.profesor = profesor;
        
        if (profesor != null && !profesor.getCursos().contains(this)){
            profesor.agregarCurso(this);
        }
        
    }
    public void mostrarInfo(){
            System.out.println("Curso: " + nombre + " (" + codigo + ")");
            System.out.println("Profesor: " + (profesor != null ? profesor.getNombre(): " Sin asignar"));
        }
    //Getters

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nombre=" + nombre + ", profesor=" + profesor + '}';
    }
    
    
}
