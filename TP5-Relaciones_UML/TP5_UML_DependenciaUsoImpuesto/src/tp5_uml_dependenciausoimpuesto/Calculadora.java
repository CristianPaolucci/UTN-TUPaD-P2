
package tp5_uml_dependenciausoimpuesto;


public class Calculadora {
    
    //Constructor
    public Calculadora() {
        System.out.println("Calculadora fiscal inicializada");
    }
    //Método con dependencia de uso
    public void calcular(Impuesto impuesto){
        System.out.println("Calculando impuesto ");
        System.out.println("Contribuyente: " + impuesto.getContribuyente().getNombre());
        System.out.println("CUIL: " + impuesto.getContribuyente().getCuit());
        System.out.println("Monto del impuesto: " + impuesto.getMonto());
    }

    @Override
    public String toString() {
        return "Calculadora{}";
    }
    
   
}
