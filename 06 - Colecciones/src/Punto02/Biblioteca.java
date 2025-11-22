package Punto02;

import java.util.ArrayList;
import java.util.List;
import mis.librerias.Consola;

/**
 * 1 Biblioteca -> N libros (Composicion).
 * Si se elimina la biblioteca sus libros desaparecen con ella. 
 * La lista es parte interna, se crea dentro de la biblioteca
 * @author Astrid
 */
public class Biblioteca {
    //atributos
    private String nombre;
    //uso la interfaz List
    private List<Libro> libros;
    
    //constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>(); //se instancia adentro del constructor
    }
    
    //metodos
    public void agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor) {
        Libro nuevo = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevo);
    }
    
    public void listarLibros() {
        if (libros.isEmpty()) {
            Consola.escribir("La Biblioteca esta vacia.");
            return;
        }
        
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    } 
    
    public Libro buscarLibroPorIsbn(String isbn){
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) {
                return l;
            }
        }
        return null;
    } 
    
    public boolean eliminarLibro(String isbn) {
        Libro l = buscarLibroPorIsbn(isbn);
        
        if (l == null) {
            Consola.escribir("Libro no encontrado.");
            return false;
        }
        
        libros.remove(l);
        Consola.escribir("Libro eliminado correctamente.");
        return true;
    } 
    public int obtenerCantidadLibros() {
        return libros.size();
        }
    
    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> resultado = new ArrayList<>();
        
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                resultado.add(l);
            }
        }
        return resultado;
    }
    //Mostrar autores disponibles sin repetirlos, usando ArrayList
    public void mostrarAutoresDisponibles() {
        List<Autor> autoresEncontrados = new ArrayList<>();
        
        for (Libro l : libros) {
            Autor a = l.getAutor();
            
            // evito la duplicacion con contains()
            if (!autoresEncontrados.contains(a)) {
                autoresEncontrados.add(a);
            }
        }
        Consola.escribir("Autores disponibles: ");
        for (Autor a : autoresEncontrados) {
            a.mostrarInfo();
        }
    } 

}
