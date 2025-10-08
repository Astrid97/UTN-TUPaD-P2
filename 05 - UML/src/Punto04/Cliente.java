package Punto04;

/**
 *
 * @author Astrid
 */
public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;  // asociación bidireccional

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setTarjeta(TarjetaDeCredito tarjeta) {
        if (this.tarjeta == tarjeta) return;     
        this.tarjeta = tarjeta;
        if (tarjeta != null) {
            tarjeta.setCliente(this);
        }
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public TarjetaDeCredito getTarjeta() { return tarjeta; }
}
