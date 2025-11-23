package Punto04;

/**
 *
 * @author Astrid
 */
public class Vaca extends Animal {
    
    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Muuuu muu!");
    }
    
}
