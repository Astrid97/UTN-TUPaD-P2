package Punto13;

/**
 *
 * @author Astrid
 */
public class Principal {
    public static void main(String[] args) {
        Usuario u = new Usuario("Sylvester Stallone", "SStallone46@example.com");
        GeneradorQR gen = new GeneradorQR();

        // Dependencia de creación: GeneradorQR crea el QR ad-hoc
        gen.generar("R-ocky-1976-OK", u);
    }

}
