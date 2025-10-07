package Punto01;

import java.time.LocalDate;

/**
 *
 * @author Astrid
 */
public class Pasaporte {
    private String numero;
    private LocalDate fechaEmision;
    private Foto foto;          // composición
    private Titular titular;    // asociación bidireccional

    public Pasaporte(String numero, LocalDate fechaEmision, String imagen, String formatoFoto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formatoFoto); // composición
    }

    public void setTitular(Titular titular) {
        if (this.titular == titular) return;              // evita recursión
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    public String getNumero() { return numero; }
    public LocalDate getFechaEmision() { return fechaEmision; }
    public Foto getFoto() { return foto; }
    public Titular getTitular() { return titular; }

}
