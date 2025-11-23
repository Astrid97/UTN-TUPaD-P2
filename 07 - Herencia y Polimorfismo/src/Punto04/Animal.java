package Punto04;

/**
 *
 * @author Astrid
 */
public class Animal {
    private final String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void hacerSonido() {
        System.out.println("Este animal hace un sonido");
    }
    
    public void describirAnimal() {
        System.out.println("Soy un animal llamado: " + nombre);
    }
}
