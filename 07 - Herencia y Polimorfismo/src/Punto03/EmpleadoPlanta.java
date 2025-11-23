package Punto03;

/**
 *
 * @author Astrid
 */
public class EmpleadoPlanta extends Empleado {
    
    private final double sueldoMensual;

    public EmpleadoPlanta(String nombre, double sueldoMensual) {
        super(nombre);
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSueldo() {
        return sueldoMensual;
    } 
}
