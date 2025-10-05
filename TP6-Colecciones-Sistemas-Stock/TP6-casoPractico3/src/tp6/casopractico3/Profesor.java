package tp6.casopractico3;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void agregarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
        }

        if (curso.getProfesor() != this) {
            curso.setProfesor(this);
        }
    }

    public void eliminarCurso(Curso curso) {
        cursos.remove(curso);
    }

    public void listarCursos() {
        for (Curso curso : cursos) {
            System.out.println("- " + curso.getCodigo() + ": " + curso.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cantidad de cursos: " + cursos.size());
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + '}';
    }
}
