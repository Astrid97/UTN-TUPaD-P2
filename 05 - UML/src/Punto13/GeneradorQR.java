package Punto13;

/**
 *
 * @author Astrid
 */
public class GeneradorQR {
    // Dependencia de creacion: crea CodigoQR dentro del metodo y lo devuelve (no lo almacena)
    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario);
        qr.mostrar();
    }
}
