
package tp5_uml_dependenciausoimpuesto;


public class TP5_UML_DependenciaUsoImpuesto {

  
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Pablo Sanchez", "27-17654001-1");
        Impuesto impuesto = new Impuesto(17380.50, contribuyente);
        
        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);
    }
    
}
