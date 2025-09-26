
package tp5_uml_dependenciacreacioneditorvideo;


public class TP5_UML_DependenciaCreacionEditorVideo {

    public static void main(String[] args) {
        Proyecto proyecto1 = new Proyecto("Video institucional", "5");
        EditorVideo editor = new EditorVideo();
        editor.exportar("MP4", proyecto1);
        
    }
    
}
