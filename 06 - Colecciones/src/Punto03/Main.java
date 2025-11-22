package Punto03;
import mis.librerias.Consola;
/**
 *
 * @author Astrid
 */
public class Main {
    public static void main(String[] args) {
        //1.	Crear al menos 3 profesores y 5 cursos. 
        Profesor prof1 = new Profesor("P001", "Ana Garcia", "Matematica");
        Profesor prof2 = new Profesor("P002", "Luis Perez", "Programacion");
        Profesor prof3 = new Profesor("P003", "Maria Lopez", "Bases de Datos");

        Curso c1 = new Curso("MAT101", "Algebra I");
        Curso c2 = new Curso("MAT102", "Analisis I");
        Curso c3 = new Curso("PRG101", "Introduccion a la Programacion");
        Curso c4 = new Curso("BD101", "Fundamentos de Bases de Datos");
        Curso c5 = new Curso("PRG201", "Programacion II");
    
        //2.	Agregar profesores y cursos a la universidad. 
        Universidad uni = new Universidad("Universidad UTN");
    
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);
    
        //3.	Asignar profesores a cursos usando asignarProfesorACurso(...). 
        Consola.escribir("\n--- Asignacion inicial de profesores a cursos ---");
        uni.asignarProfesorACurso("MAT101", "P001"); // Ana - Algebra I
        uni.asignarProfesorACurso("MAT102", "P001"); // Ana - Analisis I
        uni.asignarProfesorACurso("PRG101", "P002"); // Luis → Intro Prog
        uni.asignarProfesorACurso("PRG201", "P002"); // Luis → Prog II
        uni.asignarProfesorACurso("BD101", "P003");  // Maria → BD
    
        //4.	Listar cursos con su profesor y profesores con sus cursos. 
        Consola.escribir("\n--- Cursos con su profesor ---");
        uni.listarCursos();
        
        Consola.escribir("\n--- Profesores con sus cursos ---");
        uni.listarProfesores(); 
    
        //5.	Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
        Consola.escribir("\n--- Cambio de profesor del curso PRG201 ---");
        // PRG201 estaba con P002 (Luis), ahora lo pasamos a P003 (Maria)
        uni.asignarProfesorACurso("PRG201", "P003");

        Consola.escribir("\nCursos luego del cambio de profesor:");
        uni.listarCursos();

        Consola.escribir("\nProfesores luego del cambio de profesor en PRG201:");
        uni.listarProfesores();
    
        //6.	Remover un curso y confirmar que ya no aparece en la lista del profesor. 
        Consola.escribir("\n--- Eliminando curso MAT102 (Analisis I) ---");
        uni.eliminarCurso("MAT102");

        Consola.escribir("\nCursos luego de eliminar MAT102:");
        uni.listarCursos();

        Consola.escribir("\nProfesores luego de eliminar MAT102:");
        uni.listarProfesores(); // Ana ya no deberia tener MAT102
    
        //7.	Remover un profesor y dejar profesor = null  
        Consola.escribir("\n--- Eliminando profesor P002 (Luis Perez) ---");
        uni.eliminarProfesor("P002");

        Consola.escribir("\nCursos luego de eliminar al profesor P002:");
        uni.listarCursos(); // los cursos que dictaba P002 deben quedar con profesor = null

        Consola.escribir("\nProfesores luego de eliminar P002:");
        uni.listarProfesores();
    
        //8. Mostrar un reporte: cantidad de cursos por profesor. 
        Consola.escribir("\n--- Reporte: cantidad de cursos por profesor ---");
        uni.listarProfesores();

        Consola.escribir("\n--- Fin del programa ---");
    }
}
