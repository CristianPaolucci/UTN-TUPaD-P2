
package tp6.casopractico3;


public class Principal {

   
    public static void main(String[] args) {
        //Se crea universidad
        Universidad universidad = new Universidad("UTN");
        
        //Instancia de profesores
        Profesor profe1 = new Profesor ("P1", "Laura Chavarría", "Matemática");
        Profesor profe2 = new Profesor ("P2", "Carlos Pérez", "Programación");
        Profesor profe3 = new Profesor("P3", "Ana Lopez", "Ayso");
        
        //Instanncia de cursos
        Curso curso1 = new Curso("C101", "Algebra");
        Curso curso2 = new Curso ("C102", "Programación I");
        Curso curso3 = new Curso("C103", "Sistemas Operativos");
        Curso curso4 = new Curso("C104", "Probabilidades");
        Curso curso5 = new Curso("C105", "Estructuras de Datos");
        
        //Se agregan los profesores a universida
        universidad.agregarProfesor(profe1);
        universidad.agregarProfesor(profe2);
        universidad.agregarProfesor(profe3);
        
        //Se agregan los cursos a universidad
        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);
        
        //Se asigna profesor a la universidad
        universidad.asignarProfesorACurso("C101", "P1");
        universidad.asignarProfesorACurso("C102", "P2");
        universidad.asignarProfesorACurso("C103", "P3");
        universidad.asignarProfesorACurso("C104", "P2");
        universidad.asignarProfesorACurso("C105", "P2");
        
        //Listar cursos
        System.out.println("Cursos: ");
        universidad.listarCursos();
        
        //Listar profesores y cursos
        System.out.println("Profesores: ");
        universidad.listarProfesores();
        
        //Cambiar profesor de un curso
        System.out.println("Cambiando profesor de C101 ");
        universidad.asignarProfesorACurso("C101", "P2");
        
        //Listar cursos actualizados
        System.out.println("\n Cursos Actualizado:");
        universidad.listarCursos();
        
        //Eliminar curso C102
        System.out.println("\nEliminando cursos C102");
        universidad.eliminarCurso("C102");
        
        //Eliminar profesor P2(sus cursos deben quedar sin profesor)
        System.out.println("Eliminando profesor P2 ");
        universidad.eliminarProfesor("P2");
        
        //Mostrar reporte final
        System.out.println("\n Reporte de cantidad de cursos por profesor: ");
        universidad.mostrarReporteCursosPorProfesor();
        
    }
    
}
