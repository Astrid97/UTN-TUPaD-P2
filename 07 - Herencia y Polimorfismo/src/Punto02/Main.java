package Punto02;

import java.util.ArrayList;

/**
 *
 * @author Astrid
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        
            figuras.add(new Circulo("Circulo 1", 2.5));
            figuras.add(new Rectangulo("Rectangulo 1", 3.0, 4.0));
            figuras.add(new Circulo("Circulo 2", 1.2));
            figuras.add(new Rectangulo("Rectangulo 2", 5.0, 2.0));
        
            for (Figura f : figuras) {
                System.out.println(f); //toString de cada figura
            
        }
    }
}
