package Punto13;

/**
 *
 * @author Astrid
 */
public class CodigoQR {
    private String valor;    // texto codificado
    private Usuario usuario; // asociacion unidireccional: QR conoce al Usuario

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public String getValor()   { return valor; }
    public Usuario getUsuario(){ return usuario; }

    public void mostrar() {
        System.out.println("QR: \"" + valor + "\" para " +
                usuario.getNombre() + " <" + usuario.getEmail() + ">");
    }
}
