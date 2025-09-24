package modulo03;

/**
 *
 * @author Astrid
 */
//libreria para fechas y años
import java.time.Year;
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
 
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    //modifica el año de publicacion con validacion
    public void setAnioPublicacion(int nuevoAnio) {
        int anioActual = Year.now().getValue();
        if(nuevoAnio >= 1900 && nuevoAnio <= anioActual){
            this.anioPublicacion = nuevoAnio;
            System.out.println("Anio de publicacion actualizado correctamente.");
            } else {
                System.out.println("Error: el anio debe estar entre 1900 y " + anioActual);
        }
        
    }
    
    public void mostrarInfo() {
        System.out.println("Titulo : " + titulo);
        System.out.println("Autor : " + autor);
        System.out.println("Anio de publicacion : " + anioPublicacion);
    }
    
}
