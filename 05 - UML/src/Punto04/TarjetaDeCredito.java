package Punto04;

import java.time.LocalDate;

/**
 *
 * @author Astrid
 */
public class TarjetaDeCredito {
    private String numero;
    private LocalDate fechaVencimiento;

    //relaciones
    private Banco banco;       // Agregacion (Tarjeta conoce a Banco)
    private Cliente cliente;   // Asociacion bidireccional

    public TarjetaDeCredito(String numero, LocalDate fechaVencimiento) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void setCliente(Cliente cliente) {
        if (this.cliente == cliente) return;   
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
        }
    }

    public void mostrarInfo() {
        System.out.println("Tarjeta " + numero + " (vence: " + fechaVencimiento + ")");
        if (banco != null)
            System.out.println("Banco: " + banco.getNombre() + " - CUIT " + banco.getCuit());
        if (cliente != null)
            System.out.println("Cliente: " + cliente.getNombre() + " - DNI " + cliente.getDni());
    }
}
