
package tp5_uml_dependenciacreacioneditorvideo;


public class Render {
    private String formato;
    private Proyecto proyecto;
    
    //Constructor

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return "Render{" + "formato=" + formato + ", proyecto=" + proyecto + '}';
    }
    //Getters

    public String getFormato() {
        return formato;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }
    

    
    
    

    
    
    
}
