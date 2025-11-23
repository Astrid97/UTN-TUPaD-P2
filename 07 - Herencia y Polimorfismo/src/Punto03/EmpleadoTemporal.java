package Punto03;

/**
 *
 * @author Astrid
 */
public class EmpleadoTemporal extends Empleado {
    private final int horasTrabajadas;
    private final double valorHora;

    public EmpleadoTemporal(String nombre, int horasTrabajadas, double valorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * valorHora;
    }
    
}
