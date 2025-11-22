package Punto02;
import mis.librerias.Consola;
/**
 * Autor y libro tienen una relacion de agregacion
 * el autor no depende del libro
 * @author Astrid
 */
public class Libro {
    //atributos
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;
    
    //constructor
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }
    
    //metodos
     public void mostrarInfo() {
        Consola.escribir("Titulo: " + titulo);
        Consola.escribir("ISBN: " + isbn);
        // cada libro tiene un autor
        Consola.escribir("año: " + anioPublicacion);
        Consola.escribir("Autor: ");
        autor.mostrarInfo();
        Consola.escribir("-----------------------------------");
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }
    
    
}
