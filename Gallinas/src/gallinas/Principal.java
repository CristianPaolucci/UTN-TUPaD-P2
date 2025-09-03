
package gallinas;


public class Principal {

    
    public static void main(String[] args) {
       //Se instancia dos gallinas
       Gallinas gallina1 = new Gallinas(1, 2); //id 1, edad inicial 2
       Gallinas gallina2 = new Gallinas(2,1);  //id 2, edad inicial 1
       
       //Simular acciones de las gallina1
    gallina1.ponerHuevos();
    gallina1.ponerHuevos();
    gallina1.envejecer();
    
    //Simular acciones gallina2
    gallina2.ponerHuevos();
    gallina2.envejecer();
    gallina2.envejecer();
    
    //Mostrar estado final de ambas gallinas
        System.out.println("\nEstado final de gallinas");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    
       
    }
    
    
}
