
package tp5_uml_dependenciausoimpuesto;


public class Impuesto {
    private double monto;
    private Contribuyente contribuyente; // Asociación unidireccional
    
    //Constructor

    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }

    @Override
    public String toString() {
        return "Impuesto{" + "monto=" + monto + ", contribuyente=" + contribuyente + '}';
    }
    //Getters

    public double getMonto() {
        return monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }
    
    
}
