package Punto03;
import java.util.ArrayList;
import mis.librerias.Consola;
import java.util.List;

/**
 * La relacion Profesor - Curso es bidireccional.
 * Desde curso se accede a su Profesor, y desde Profesor se accede a la lista de Cursos que dicta.
 * Además, existe la clase Universidad que administra el alta/baja y consulta de profesores y cursos. 
 * Invariante de asociación: cada vez que se asigne o cambie el profesor de un curso, debe actualizarse 
 * en los dos lados (agregar/quitar en la lista del profesor correspondiente). 
 * 
 * Profesor tiene muchos cursos
 * 
 * LA RELACION SE SINCRONIZA EN LOS METODOS
 * @author Astrid
 */
public class Profesor {
    //atributos
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;
    
    //constructor
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>(); //lista inicializada
    }
    
    //metodos
    public void agregarCurso(Curso c) {
        if (c == null) {
        return;
    }

        // Si no lo tengo en mi lista, lo agrego
        if (!cursos.contains(c)) {
            cursos.add(c);
        }

        // Si el curso todavía no tiene este profesor, lo sincronizo
        if (c.getProfesor() != this) {
            c.setProfesor(this);
        }
        
    }

    public void eliminarCurso(Curso c) {
 
        if (c == null) {
            return;
        }

        if (cursos.contains(c)) {
            cursos.remove(c);
        }

        if (c.getProfesor() == this) {
            c.setProfesor(null);  // rompe la relación del otro lado
        }
    }

    public void listarCursos() {
        // recorre cursos y muestra codigo + nombre
        if (cursos.isEmpty()) {
        Consola.escribir("El profesor no tiene cursos asignados.");
        return;
        }

        Consola.escribir("Cursos dictados por " + nombre + ":");
        for (Curso c : cursos) {
            Consola.escribir("- " + c.getCodigo() + " | " + c.getNombre());
    }
    }

    public void mostrarInfo() {
    // muestra id, nombre, especialidad, cantidad de cursos
        Consola.escribir("ID : " + id);
        Consola.escribir("Nombre completo: " + nombre);
        Consola.escribir("Especialidad: " + especialidad);
        Consola.escribir("Cantidad de cursos: " + cursos.size());
        Consola.escribir("-----------------------------------");
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
    
    
    
}
