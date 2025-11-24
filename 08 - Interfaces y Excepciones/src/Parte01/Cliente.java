package Parte01;

/**
 *
 * @author Astrid
 */
public class Cliente implements Notificable {
    
    private final String nombre;
    private final String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public void notificar(String mensaje) {
        System.out.println(" Notificando a " + nombre + " Email: " + email + mensaje);
    }
    
}
