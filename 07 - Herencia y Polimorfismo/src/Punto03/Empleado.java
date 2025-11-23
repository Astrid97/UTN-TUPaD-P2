package Punto03;

/**
 *
 * @author Astrid
 */
public abstract class Empleado {
    
    private final String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public abstract double calcularSueldo();

    @Override
    public String toString() {
        return nombre + " - Sueldo: $" + calcularSueldo();
    }
}
