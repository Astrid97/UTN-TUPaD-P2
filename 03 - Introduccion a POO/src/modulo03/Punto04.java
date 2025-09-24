package modulo03;

/**
 *
 * @author Astrid
 */
public class Punto04 {
    public static void main(String[] args) {
        Gallina g1 = new Gallina();
        Gallina g2 = new Gallina();
        
        g1.setIdGallina(1234);
        g2.setIdGallina(5678);
        
        
        System.out.println("Estado Inicial: ");
        g1.mostrarEstado();
        g2.mostrarEstado();
        
        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();
                
        g2.envejecer();
        g2.envejecer();
        g2.ponerHuevo();
        
        System.out.println("Estado Final: ");
        g1.mostrarEstado();
        g2.mostrarEstado();
        
    }
}
