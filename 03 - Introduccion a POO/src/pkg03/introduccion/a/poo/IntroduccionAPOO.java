package pkg03.introduccion.a.poo;

/**
 *
 * @author Astrid
 */
public class IntroduccionAPOO {
    
    public static void main(String[] args) {
        Auto a = new Auto();
        a.patente = "ABC123";
        a.color = "Verde";
        a.kms = 400;
        a.conAire = true;
        a.mostrarDatos();
        
        Auto a2 = new Auto();
        a2.patente = "DEF456";
        a2.color = "Rojo";
        a2.kms = 600;
        a2.conAire = false;
        a2.mostrarDatos();
    }
    
}
