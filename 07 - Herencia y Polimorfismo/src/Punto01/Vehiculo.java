package Punto01;

/**
 *
 * @author Astrid
 */
public abstract class Vehiculo {
    private final String marca;
    private final String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public abstract void mostrarInfo(); //obliga a las subclases a implementarlo

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
