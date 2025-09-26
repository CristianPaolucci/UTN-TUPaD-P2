
package tp5relaciones_uml_citamedica;


public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;
    
    //Constructor

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    @Override
    public String toString() {
        return "CitaMedica{" + "fecha=" + fecha + ", hora=" + hora + ", paciente=" + paciente + ", profesional=" + profesional + '}';
    }

    
    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }
    public void mostrar(){
        System.out.println("Cita Médica: ");
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("Paciente: " + paciente.getNombre() + " Obra Social: " + paciente.getObraSocial());
        System.out.println("Profesional: " + profesional.getNombre() + " Especialidad: " + profesional.getEspecialidad());
        
    }
    public void setProfesional(Profesional profesional){
        this.profesional = profesional;
    }
    
    
    
}
