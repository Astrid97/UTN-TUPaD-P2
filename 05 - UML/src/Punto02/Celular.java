package Punto02;

/**
 *
 * @author Astrid
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;   // agregacion
    private Usuario usuario;   // asociacion bidireccional

    public Celular(String imei, String marca, String modelo) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public void setUsuario(Usuario usuario) {
        if (this.usuario == usuario) return;
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }

    public void mostrarInfo() {
        System.out.println("Celular " + marca + " modelo " + modelo + " (IMEI " + imei + ")");
        if (bateria != null)
            System.out.println("Bateria: " + bateria.getModelo() + " - " + bateria.getCapacidad() + " mAh");
        if (usuario != null)
            System.out.println("Usuario: " + usuario.getNombre() + " - DNI " + usuario.getDni());
    }
}

