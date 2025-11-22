package Punto02;
import mis.librerias.Consola;
/**
 *
 * @author Astrid
 */
public class Autor {
    // Atributos
    private String id;
    private String nombre;
    private String nacionalidad;
    
    // constructor
    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    //metodo
    public void mostrarInfo() {
        Consola.escribir("Autor ID: " + id);
        Consola.escribir("Nombre: " + nombre);
        Consola.escribir("Nacionalidad: " + nacionalidad);
        Consola.escribir("-----------------------------------");
    }   
}
