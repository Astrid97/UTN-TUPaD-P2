package Parte01;

/**
 *
 * @author Astrid
 */
public class Paypal implements PagoConDescuento {
    private final String emailCuenta;
    private final double porcentajeDescuento;

    public Paypal(String emailCuenta, double porcentajeDescuento) {
        this.emailCuenta = emailCuenta;
        this.porcentajeDescuento = porcentajeDescuento;
    }
    
    
    @Override
    public double aplicarDescuento(double monto) {
        return monto * (1 - porcentajeDescuento);
    }

    @Override
    public void procesarPago(double monto) {
        double montoConDescuento = aplicarDescuento(monto);
        System.out.println("Pagado con Paypal (" + emailCuenta + ")" 
                + " - Monto original: $" + monto 
                + " - Monto con descuento: $ " + montoConDescuento);
    }
    
}
