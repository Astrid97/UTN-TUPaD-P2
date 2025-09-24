package modulo03;

/**
 *
 * @author Astrid
 */
public class Punto05 {
    public static void main(String[] args) {
        NaveEspacial nave1 = new NaveEspacial();
        nave1.setNombre("Apolo 11");
        nave1.setCombustible(50);
        
        System.out.println("Estado inicial: ");
        nave1.mostrarEstado();
        
        //avanzo sin cargar
        nave1.avanzar(30);
        
        // cargo combustible
        nave1.recargarCombustible(40);
        
        //avanzo de nuevo
        nave1.avanzar(30);
        
        System.out.println("Estado final: ");
        nave1.mostrarEstado();
    }
}
