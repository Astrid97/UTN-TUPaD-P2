package modulo03;

/**
 *
 * @author Astrid
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;
    private static final int MAX_COMBUSTIBLE=100;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    
    public void mostrarEstado() {
        System.out.println("Nombre de la nave: " + nombre);
        System.out.println("Combustible disponible: " + combustible + " unidades");
        System.out.println("------------------------------------");
    }
    
    public void despegar() {
        if(combustible >= 10) {
            combustible -= 10;
            System.out.println("Nave: " + nombre + "ha despegado.");
            System.out.println("Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
            System.out.println("Al menos se necesitan 10 unidades");
        }
    }
    
    public void avanzar(int distancia) {
        int consumo = distancia * 2; // 2 unidades por cada distancia
        if (combustible >= consumo) {
            combustible -= consumo;
        System.out.println("La nave avanzo " + distancia + " km.");
        System.out.println("Combustible restante: " + combustible);
        } else {
        System.out.println("Combustible insuficiente para avanzar " + distancia + " km.");
        }
    }
        
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad > MAX_COMBUSTIBLE) {
            combustible = MAX_COMBUSTIBLE;
            System.out.println("Combustible cargado al maximo " + MAX_COMBUSTIBLE);
        } else {
            combustible += cantidad;
            System.out.println("Se cargaron " + cantidad + " unidades. Combustible actual: " + combustible);
        }
    }
}
