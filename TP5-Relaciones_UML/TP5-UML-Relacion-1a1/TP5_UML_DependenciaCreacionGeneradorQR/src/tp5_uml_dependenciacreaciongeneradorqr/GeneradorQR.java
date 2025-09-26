
package tp5_uml_dependenciacreaciongeneradorqr;


public class GeneradorQR {
    
    //Constructor vacio
    public GeneradorQR(){
        System.out.println("Generador de QR inicializado");
    }
    //Dependencia de creación: se crea un CodigoQR dentro del método
    public void generar(String valor, Usuario usuario){
        CodigoQR codigo1 = new CodigoQR(valor, usuario); //Se crea acá
        System.out.println("Código QR generado: " + codigo1);
        System.out.println(" Valor: " + codigo1.getValor());
        System.out.println(" Usuario: " + usuario.getNombre() + " Email: " + usuario.getEmail());
        
    }
    
}
