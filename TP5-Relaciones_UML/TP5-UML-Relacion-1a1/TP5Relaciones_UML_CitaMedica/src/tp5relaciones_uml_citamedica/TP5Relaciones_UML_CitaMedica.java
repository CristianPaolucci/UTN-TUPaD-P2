
package tp5relaciones_uml_citamedica;


public class TP5Relaciones_UML_CitaMedica {

    
    public static void main(String[] args) {
        
        //Crear paciente
        Paciente paciente1 = new Paciente("Juan Gonzalez", "OSMedica");
        //Crear profesional
        Profesional profesional1 = new Profesional("Alberto Cortez", "Neurología");
        //Crear cita médica
        CitaMedica cita1 = new CitaMedica("12/10/2025", "13:30", paciente1, profesional1);
        
        cita1.mostrar();
        
        System.out.println();
        
        System.out.println(cita1);
        
        
        
    }
    
}
