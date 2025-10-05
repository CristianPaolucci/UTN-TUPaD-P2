package tp6.casopractico3;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();

    // Constructor
    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    // Agregar profesor
    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    // Agregar curso
    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    // Asignar profesor a curso
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
        }
    }

    // Eliminar curso
    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            curso.setProfesor(null); // Rompe vínculo con el profesor
            cursos.remove(curso);
        }
    }

    // Eliminar profesor
    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            for (Curso curso : new ArrayList<>(profesor.getCursos())) {
                curso.setProfesor(null); // Rompe vínculo en ambos lados
            }
            profesores.remove(profesor);
        }
    }

    // Buscar curso por código
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equalsIgnoreCase(codigo)) {
                return curso;
            }
        }
        return null;
    }

    // Buscar profesor por ID
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor profesor : profesores) {
            if (profesor.getId().equalsIgnoreCase(id)) {
                return profesor;
            }
        }
        return null;
    }

    // Listar todos los cursos
    public void listarCursos() {
        for (Curso curso : cursos) {
            curso.mostrarInfo();
            System.out.println("--------------------------------");
        }
    }

    // Listar todos los profesores
    public void listarProfesores() {
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
            profesor.listarCursos();
            System.out.println("----------------------------------");
        }
    }

    // Mostrar reporte de cantidad de cursos por profesor
    public void mostrarReporteCursosPorProfesor() {
        for (Profesor profesor : profesores) {
            System.out.println(profesor.getNombre() + " dicta " + profesor.getCursos().size() + " cursos.");
        }
    }
}
