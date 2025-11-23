package Punto04;

import java.util.ArrayList;

/**
 *
 * @author Astrid
 */
public class Main {
    public static void main(String[] args) {
        
        ArrayList<Animal> animales = new ArrayList<>();
        
        animales.add(new Perro("Firulais"));
        animales.add(new Gato("Mishito"));
        animales.add(new Vaca("Lola"));
        
        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
            System.out.println("----------------------------------");
        }
    }
}
