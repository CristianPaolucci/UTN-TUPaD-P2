
package tp5_uml_dependenciacreaciongeneradorqr;


public class TP5_UML_DependenciaCreacionGeneradorQR {

    
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Florencia Estevez", "florencia@mail.com");
        GeneradorQR generador = new GeneradorQR();
        generador.generar("https://codigo.com/qr/234 xyz", usuario1);
        
    }
    
}
