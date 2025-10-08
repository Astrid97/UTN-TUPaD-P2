package Punto03;

/**
 *
 * @author Astrid
 */
public class Libro {
    private String titulo;
    private String isbn;
  
    private Autor autor;        // Asociacion unidireccional (Libro conoce al Autor)
    private Editorial editorial; // Agregacion (Libro tiene una referencia a Editorial)

    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    public void setAutor(Autor autor) { this.autor = autor; }
    public void setEditorial(Editorial editorial) { this.editorial = editorial; }

    public void mostrarFicha() {
        System.out.println("Libro: " + titulo + " (ISBN " + isbn + ")");
        if (autor != null)
            System.out.println("Autor: " + autor.getNombre() + " - " + autor.getNacionalidad());
        if (editorial != null)
            System.out.println("Editorial: " + editorial.getNombre() + " - " + editorial.getDireccion());
    }
}
