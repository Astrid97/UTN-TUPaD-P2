package modulo03;

/**
 *
 * @author Astrid
 */

public class Punto03 {
    public static void main(String[] args) {
        Libro miLibro = new Libro();
        miLibro.setTitulo("Como Programar en Java");
        miLibro.setAutor("Deitel");
        miLibro.setAnioPublicacion(2017);
        
        System.out.println("Info Inicial: ");
        miLibro.mostrarInfo();
        
        miLibro.setAnioPublicacion(40);
        miLibro.setAnioPublicacion(2021);
        
        miLibro.mostrarInfo();
        
    }
    
}
