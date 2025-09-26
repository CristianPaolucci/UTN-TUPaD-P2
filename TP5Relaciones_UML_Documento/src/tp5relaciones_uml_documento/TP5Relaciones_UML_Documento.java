
package tp5relaciones_uml_documento;


public class TP5Relaciones_UML_Documento {

   
    public static void main(String[] args) {
        //Crear usuario
        Usuario usuario1 = new Usuario("Lucila Torres", "lucilatores@mail.com");
        
        //Crear firma digital con ese usuario
        FirmaDigital firma1 = new FirmaDigital("Hash123465", "30/09/2025", usuario1);
        
        //Crear documento con esa firma
        Documento documento1 = new Documento("Contrato alquiler", "Terminos del alquiler ", firma1);
        
        //Mostrar información
        documento1.mostrar();
        
        System.out.println();
        
        System.out.println("\nCon toString:\n" + documento1);
    }
    
}
