package modulo03;

/**
 *
 * @author Astrid
 */
public class Punto02 {
    public static void main(String[] args) {
        Mascota mascota = new Mascota();
        
        mascota.setNombre("Max");
        mascota.setEdad(3);
        mascota.setEspecie("Gato");
        
        System.out.println("Informacion inicial: ");
        mascota.mostrarInfo();
        
        //cumpleaños
        
        mascota.cumplirAnios();
        mascota.cumplirAnios();
        
        System.out.println("Informacion final: ");
        mascota.mostrarInfo();
         
    }
    
}
