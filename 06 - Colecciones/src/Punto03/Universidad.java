package Punto03;

import java.util.ArrayList;
import java.util.List;
import mis.librerias.Consola;

/**
 * Adminitra listas de Profesores y Cursos
 * se encarga de asignar y eliminar correctamente 
 * @author Astrid
 */
public class Universidad {
    //atributos
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;
    
    //constructor
    public Universidad(String nombre){
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    //metodos
    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso == null) {
            Consola.escribir("Curso no encontrado.");
            return;
        }
        if (profesor == null) {
            Consola.escribir("Profesor no encontrado.");
            return;
        }

        curso.setProfesor(profesor); // aca se sincronizan ambos lados
        Consola.escribir("Profesor " + profesor.getNombre() +
                     " asignado al curso " + curso.getNombre());
    }

    public void listarProfesores() {
        if (profesores.isEmpty()) {
            Consola.escribir("No hay profesores registrados.");
            return;
        }
        for (Profesor p : profesores) {
            p.mostrarInfo();
            p.listarCursos();
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            Consola.escribir("No hay cursos registrados.");
            return;
        }
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor prof : profesores) {
            if (prof.getId().equals(id)) {
                return prof;
            }
        }
        return null;
    }
 
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    public boolean eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);

        if (curso == null) {
            Consola.escribir("Curso no encontrado.");
            return false;
        }

        // Si tiene profesor, romper relacion bidireccional
        if (curso.getProfesor() != null) {
            curso.setProfesor(null); // esto tambien lo saca de la lista del profesor
        }

        cursos.remove(curso);
        Consola.escribir("Curso eliminado correctamente.");
        return true;
    }

//	eliminarProfesor(String id) → Antes de remover, dejar null los cursos que dictaba. 
    public boolean eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);

        if (profesor == null) {
            Consola.escribir("Profesor no encontrado.");
            return false;
        }

        // Romper relacion en todos los cursos que tenia asignados
        for (Curso c : cursos) {
            if (c.getProfesor() == profesor) {
                c.setProfesor(null);
            }
        }

        profesores.remove(profesor);
        Consola.escribir("Profesor eliminado correctamente.");
        return true;
    }
}
