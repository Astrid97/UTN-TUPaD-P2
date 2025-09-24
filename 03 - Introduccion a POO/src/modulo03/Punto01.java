package modulo03;

/**
 *
 * @author Astrid
 */
public class Punto01 {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Ana");
        estudiante.setApellido("Gomez");
        estudiante.setCurso("Matematicas");
        estudiante.setCalificacion(5);
        
        System.out.println("Informacion Inicial: ");
        estudiante.mostrarInfo();
        
        System.out.println("Subir calificacion en 1.5 puntos");
        estudiante.subirCalificacion(1.5);
        
        System.out.println("Bajar calificacion en 5 puntos");
        estudiante.bajarCalificacion(5);
        
        System.out.println("Informacion final");
        estudiante.mostrarInfo();
        
    }
}
