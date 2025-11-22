package Punto01;

import mis.librerias.Consola;

/**
 *
 * @author Astrid
 */
public class Producto {
    // atributos 
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;
    
    //constructor
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    //metodo, muestra en consola la informacion del producto
    public void mostrarInfo() {
        Consola.escribir("ID: " + id);
        Consola.escribir("Nombre: " + nombre);
        Consola.escribir("Precio: " + precio);
        Consola.escribir("Cantidad: " + cantidad);
        Consola.escribir("Categoria: " + categoria + "(" + categoria.getDescripcion() + ")" );
    }

    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", categoria=" + categoria +
                '}';
    }
            
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }    
}
