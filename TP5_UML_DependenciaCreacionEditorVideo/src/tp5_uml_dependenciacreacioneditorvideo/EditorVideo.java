
package tp5_uml_dependenciacreacioneditorvideo;


public class EditorVideo {
    
    
    //Constructor
     
    public EditorVideo() {
        System.out.println("Editor de video inicializado");
    }
    public void exportar(String formato, Proyecto proyecto){
        Render render1 = new Render(formato, proyecto); //Dependencia de creación
        System.out.println("Exportando proyecto ");
        System.out.println("Render generado: " + render1);
    }
   
    
}
