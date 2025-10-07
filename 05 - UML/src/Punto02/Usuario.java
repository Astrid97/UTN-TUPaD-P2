package Punto02;

/**
 *
 * @author Astrid
 */
public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular;

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCelular(Celular celular) {
        if (this.celular == celular) return;
        this.celular = celular;
        if (celular != null && celular != this.celular) {
            celular.setUsuario(this);
        }
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public Celular getCelular() { return celular; }
}

