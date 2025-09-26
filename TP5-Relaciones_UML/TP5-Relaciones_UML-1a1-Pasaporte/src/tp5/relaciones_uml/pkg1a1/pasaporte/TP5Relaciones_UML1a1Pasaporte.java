
package tp5.relaciones_uml.pkg1a1.pasaporte;


public class TP5Relaciones_UML1a1Pasaporte {

   
    public static void main(String[] args) {
        Titular titular = new Titular("Gonzalo Paz", "44394001");
        Pasaporte pasaporte = new Pasaporte("a0012", "2024-03-01", "foto.png", "PNG");
        
        pasaporte.setTitular(titular); //Asociación bidireccional
        
        //Verificacion
        System.out.println("Titular del pasaporte: " + pasaporte.getTitular().getNombre());
        System.out.println("Número de pasaporte: " + titular.getPasaporte().getNumero());
        System.out.println("Foto del pasaporte: " + pasaporte.getFoto().getImagen());
        
    }
    
    
}
