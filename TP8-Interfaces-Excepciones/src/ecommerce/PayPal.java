
package ecommerce;


public class PayPal implements Pago{
    @Override
    public void procesarPago(double monto){
        System.out.println("Procesando pago con PayPal. Monto: $" + monto);
    }
    
    
}
