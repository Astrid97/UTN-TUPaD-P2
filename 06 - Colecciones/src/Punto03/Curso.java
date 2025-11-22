package Punto03;

import mis.librerias.Consola;

/**
 * tiene exactamente un profesor
 * @author Astrid
 */
public class Curso {
    //atributos
    private String codigo;
    private String nombre;
    private Profesor profesor;
    
    //constructor
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null; //se le asigna luego con setProfesor()
    }
    
    //metodos
    public void setProfesor(Profesor p) {
        // si ya tenia un profesor, eliminar este curso de su lista
        if (this.profesor != null) {
            this.profesor.getCursos().remove(this); 
        }
        //asignar el nuevo profesor al curso
        this.profesor = p;
        
        //Si el profesor no es null, agregar el curso a su lista
        if (p != null && !p.getCursos().contains(this)) {
            p.getCursos().add(this);
        }        
    }
    
    public void mostrarInfo() {
        Consola.escribir("Codigo: " + codigo);
        Consola.escribir("Nombre: " + nombre);

        if (profesor != null) {
            Consola.escribir("Profesor: " + profesor.getNombre());
        } else {
            Consola.escribir("Profesor: (sin asignar)");
        }

        Consola.escribir("-----------------------------------");
    
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public Profesor getProfesor() {
        return profesor;
    }
    
}
