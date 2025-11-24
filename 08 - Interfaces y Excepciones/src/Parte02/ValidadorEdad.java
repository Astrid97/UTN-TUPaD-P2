package Parte02;

/**
 *
 * @author Astrid
 */
public class ValidadorEdad {
    public static void validarEdad(int edad) throws EdadInvalidaException {
        
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad invalida: debe estar entre 0 y 120 años");
            
        }
    }
}
