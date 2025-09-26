
package tp5.relaciones_uml.pkg1a1.celular;


public class TP5Relaciones_UML1a1Celular {

    
    public static void main(String[] args) {
        Bateria bateria1 = new Bateria("Bat123", "4000mAh");
        Celular celular1 = new Celular("19283777646662", "Samsung", "A16", bateria1);
        Usuario usuario1 = new Usuario("Pedro Paramo", "12354333");
        
       //Asociar usuario y celular (bidireccional)
       usuario1.setCelular(celular1);
       
       //Mostrar objetos para verificar que la asociación quedó bien
        System.out.println(usuario1);
        System.out.println(celular1);
        
    }
    
}
