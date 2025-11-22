package Punto01;

import java.util.ArrayList;
import mis.librerias.Consola;

/**
 *
 * @author Astrid
 */
public class Inventario {
    // un solo atributo principal
    private ArrayList<Producto> productos;
    
    //constructor, donde se inicializa la coleccion
    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    //metodos
    
    public void	agregarProducto(Producto p) {
        productos.add(p);
    }  
    //recorro arrayList con un for-each, y cada iteracion llama a producto.mostrarInfo()
    // si la lista esta vacia, y se llama al metodo: no imprime nada.
    public void	listarProductos() {
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }
    //recorro la lista de productos, comparo cada id, si coincide devuelve ese producto, 
    //si termina el ciclo devuelve null 
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {   // equals()compara contenido, sirve para Stringd y objetos comunes
                return p; //return corta toda la ejecucion del metodo
        }
    }
        return null;  
}
    //busca el producto por Id, si lo encuentra lo elimina del arrayList
    //reutilizo el metodo de busqueda por Id ya creado, para eliminar se utiliza remove()
    public boolean eliminarProducto(String id){
        Producto p = buscarProductoPorId(id);
        if (p == null) {
            Consola.escribir("Producto no encontrado.");
            return false;
        }
        
        productos.remove(p);
        Consola.escribir("Producto eliminado correctamente.");
        return true;
        }
        // llamo al setter de cantidad, en la clase producto para modificar el atributo
    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p == null) {
            return false;
        }
        
        p.setCantidad(nuevaCantidad); // actualiza
        return true;
    }
    //el metodo debe devolver un arrayList con los valores de la categoria
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> resultado = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) { //para comparar enums se usa ==, CaseSensitive
                resultado.add(p);  
            } 
        }
        return resultado;//fuera del for, recorre toda la lista completa
    }
        
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad(); //sumo el stock de cada producto
        }
        return total;
    }        
    
    public Producto obtenerProductoConMayorStock() {
        Producto mayor = null;
        for (Producto p : productos) {
            if (mayor == null) {
                mayor = p;
            } else if(p.getCantidad() > mayor.getCantidad()) {
                mayor = p;
            }
            
        }
        return mayor; //puede ser null si la lista esta vacia
    }
    
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> resultado = new ArrayList<>();
        
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {  //agrega a la lista resultado SOLO los productos que cumplen la condicion
                resultado.add(p);
            }
        }
        return resultado;
    } 
    // values() devuelve un array con todas las constantes del enum
    // uso un void porque el metodo devuelve cosas por consola(imprime)
    public void mostrarCategoriasDisponibles(){
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c + "-" + c.getDescripcion());
        }
    }
}  
	  


       
