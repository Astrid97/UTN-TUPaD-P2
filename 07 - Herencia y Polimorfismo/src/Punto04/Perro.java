package Punto04;

/**
 *
 * @author Astrid
 */
public class Perro extends Animal {
    
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau guau!"); 
    }
}
