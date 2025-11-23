package Punto01;

/**
 *
 * @author Astrid
 */
public class Auto extends Vehiculo {
    private final int cantidadPuertas;
    
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo); //llamada al constructor de Vehiculo
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }
    
    
    @Override
    public void mostrarInfo() {
        System.out.println("Auto - Marca: " + getMarca()
            + ", Modelo: " + getModelo()
            + ", Puertas: " + cantidadPuertas);
    }
    
}
