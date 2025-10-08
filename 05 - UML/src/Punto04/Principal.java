package Punto04;

import java.time.LocalDate;

/**
 *
 * @author Astrid
 */
public class Principal {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Lago", "30-12131415-6");
        Cliente cliente = new Cliente("Clint Eastwood", "10.123.890");

        TarjetaDeCredito t1 = new TarjetaDeCredito("4509 1212 3434 5656",
                LocalDate.of(2028, 12, 31));

        t1.setBanco(banco);      // Tarjeta ◇→ Banco (agregacion)
        t1.setCliente(cliente);  // Tarjeta ↔ Cliente (bidireccional)

        t1.mostrarInfo();
    }
}
