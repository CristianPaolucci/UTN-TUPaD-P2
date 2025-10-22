
package ecommerce;




public class TarjetaCredito implements PagoConDescuento {
    private double descuento = 0;

    @Override
    public void procesarPago(double monto) {
        double montoFinal = monto * (1 - descuento / 100);
        System.out.println("Procesando pago con tarjeta de crédito. Monto final: $" + montoFinal);
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        this.descuento = porcentaje;
        System.out.println("Descuento aplicado en tarjeta de crédito: " + descuento + "%");
    }
}
