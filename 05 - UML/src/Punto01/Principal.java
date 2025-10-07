package Punto01;

import java.time.LocalDate;

/**
 *
 * @author Astrid
 */
public class Principal {
    public static void main(String[] args) {
        // Crear titular
        Titular titular1 = new Titular("Frodo ", "45123890");

        // Crear pasaporte con su foto (composición)
        Pasaporte pasaporte1 = new Pasaporte("AR123456", LocalDate.of(2023, 5, 15),
                                             "foto_frodo.png", "PNG");

        // Asociar titular al pasaporte (asociación bidireccional)
        pasaporte1.setTitular(titular1);

        // Mostrar información para verificar
        System.out.println("---- Datos del Pasaporte ----");
        System.out.println("Numero: " + pasaporte1.getNumero());
        System.out.println("Fecha de Emision: " + pasaporte1.getFechaEmision());
        System.out.println("Foto: " + pasaporte1.getFoto().getImagen() + " (" + pasaporte1.getFoto().getFormato() + ")");
        System.out.println("Titular: " + pasaporte1.getTitular().getNombre() + " - DNI: " + pasaporte1.getTitular().getDni());

        System.out.println("\n---- Verificacion Bidireccional ----");
        System.out.println("El pasaporte del titular es: " + titular1.getPasaporte().getNumero());
    }
}
  
