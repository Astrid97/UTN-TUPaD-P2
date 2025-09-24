package modulo03;

/**
 *
 * @author Astrid
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        if(calificacion <0) {
        this.calificacion = 0;
        } else if(calificacion > 10) {
            this.calificacion = 10;   
        } else {
            this.calificacion = calificacion;
        }
    }
    //metodo para mostrar informacion del estudiante
    // mostrarInfo(), subirCalificacion(puntos), bajarCalificacion(puntos). 
    
    public void mostrarInfo() {
        System.out.println("Estudiante: " + apellido + ", " + nombre);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }
    
    //verificamos si al sumar los puntos de calificacion no supera el max permitido
    public void subirCalificacion(double puntos) {
        if(calificacion + puntos <= 10) {
            calificacion += puntos; 
            System.out.println("La calificacion a aumentado a: " + calificacion);
        } else {
            System.out.println("Error, no se puede superar la calificacion maxima de 10");
        }
    }
    public void bajarCalificacion(double puntos) {
        if(calificacion - puntos >= 0) {
            calificacion -= puntos; 
            System.out.println("La calificacion a disminuido a: " + calificacion);
        } else {
            System.out.println("Error, no se puede superar la calificacion minima de 0");
        }
        
    }
    
}
