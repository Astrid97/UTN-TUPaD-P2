package Parte01;

/**
 *
 * @author Astrid
 */
public class TarjetaCredito implements PagoConDescuento {
    private final String numeroTarjeta;
    private final double porcentajeDescuento;

    public TarjetaCredito(String numeroTarjeta, double porcentajeDescuento) {
        this.numeroTarjeta = numeroTarjeta;
        this.porcentajeDescuento = porcentajeDescuento;
    }
    
    
    @Override
    public double aplicarDescuento(double monto) {
        return monto * (1 - porcentajeDescuento);
    }

    @Override
    public void procesarPago(double monto) {
        double montoConDescuento = aplicarDescuento(monto);
        System.out.println("Pagando con tarjeta " + numeroTarjeta 
                + " - Monto Original: $ " + monto 
                + " - Monto con descuento: $" + montoConDescuento);
    }
}
