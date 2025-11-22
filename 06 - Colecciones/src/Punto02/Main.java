package Punto02;

import java.util.List;
import mis.librerias.Consola;

/**
 *
 * @author Astrid
 */
public class Main {
    public static void main(String[] args) {
        //1. Creamos una biblioteca. 
        
        Biblioteca biblioteca = new Biblioteca("El refugio de los libros");
        
        //2. Crear al menos tres autores 
        Autor autor1 = new Autor("A001", "Julio Cortazar", "Argentina");
        Autor autor2 = new Autor("A002", "J. K. Rowling", "Reino Unido");
        Autor autor3 = new Autor("A003", "Gabriel Garcia Marquez", "Colombia");
        
        //3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca. 
        biblioteca.agregarLibro("ISBN001", "Rayuela", 1963, autor1);
        biblioteca.agregarLibro("ISBN002", "Bestiario", 1951, autor1);
        biblioteca.agregarLibro("ISBN003", "Harry Potter y la Piedra Filosofal", 1997, autor2);
        biblioteca.agregarLibro("ISBN004", "Cien años de soledad", 1967, autor3);
        biblioteca.agregarLibro("ISBN005", "El amor en los tiempos del cólera", 1985, autor3);
        
        //4. Listar todos los libros con su información y la del autor. 
        Consola.escribir("\n\n------ Lista de libros de la biblioteca ------");
        biblioteca.listarLibros();
        
        //5. Buscar un libro por su ISBN y mostrar su información. 
        Consola.escribir("\n\n------ Buscar libro por ISBN ------");
        String isbnBuscado = Consola.leer("Ingrese el ISBN a buscar: ");
        
        Libro libroBuscado = biblioteca.buscarLibroPorIsbn(isbnBuscado);
        if (libroBuscado != null) {
            Consola.escribir("Libro encontrado:");
            libroBuscado.mostrarInfo();
        } else {
            Consola.escribir("No se encontró un libro con ese ISBN.");
        }
        
        //6. Filtrar y mostrar los libros publicados en un año específico. 
        Consola.escribir("\n\n------ Filtrar libros por año de publicación ------");
        int anioFiltro = Consola.leerEntero("Ingrese el año a filtrar: ");
        
        List<Libro> librosPorAnio = biblioteca.filtrarLibrosPorAnio(anioFiltro);
        if (librosPorAnio.isEmpty()) {
            Consola.escribir("No hay libros publicados en el año " + anioFiltro + ".");
        } else {
            Consola.escribir("Libros publicados en el año " + anioFiltro + ":");
            for (Libro l : librosPorAnio) {
                l.mostrarInfo();
            }
        }
        
        //7. Eliminar un libro por su ISBN y listar los libros restantes. 
        Consola.escribir("\n\n------ Eliminar libro por ISBN ------");
        String isbnEliminar = Consola.leer("Ingrese el ISBN del libro a eliminar: ");

        biblioteca.eliminarLibro(isbnEliminar); 

        Consola.escribir("\nLista de libros luego de eliminar:");
        biblioteca.listarLibros();
        
        //8. Mostrar la cantidad total de libros en la biblioteca. 
        Consola.escribir("\n\n------ Cantidad total de libros en la biblioteca ------");
        int cantidadLibros = biblioteca.obtenerCantidadLibros();
        Consola.escribir("Cantidad de libros: " + cantidadLibros);
        
        //9. Listar todos los autores de los libros disponibles en la biblioteca.
        Consola.escribir("\n\n------ Autores disponibles en la biblioteca ------");
        biblioteca.mostrarAutoresDisponibles();

        Consola.escribir("\n------ Fin del programa ------");
    }
}
