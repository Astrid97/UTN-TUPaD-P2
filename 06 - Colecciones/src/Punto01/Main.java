package Punto01;

import java.util.ArrayList;
import mis.librerias.Consola;

/**
 * @author Astrid
 */
public class Main {
    public static void main(String[] args) {
        // 1.	Crear al menos cinco productos con diferentes categorías y agregarlos al inventario. 
        Inventario inventario = new Inventario(); // se crea el inventario
        
        Producto p1 = new Producto("P001", "Cafe de Especialidad", 40000.0, 20, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Celular", 500000.0, 5, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Vestido", 60000.0, 5, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Sofa", 450000.0, 3, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Miel Pura", 10000.0, 30, CategoriaProducto.ALIMENTOS);
        
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        
      
        // 2.	Listar todos los productos mostrando su información y categoría.  
        Consola.escribir("\n\n------ Lista de Productos ------");
        inventario.listarProductos();
        
        // 3.	Buscar un producto por ID y mostrar su información.
        Consola.escribir("\n\n------ Buscar Producto por ID ------");
        String idBuscado = Consola.leer("Ingrese ID: ");
        
        Producto buscado = inventario.buscarProductoPorId(idBuscado);
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            Consola.escribir("Producto no encontrado.");
        }
        
        // 4.	Filtrar y mostrar productos que pertenezcan a una categoría específica. 
        Consola.escribir("\n\n------ Filtrar productos por categoria ------");
        Consola.escribir("Categorias disponibles: ");
        inventario.mostrarCategoriasDisponibles();
        String categoriaBuscada = Consola.leer("Ingrese la categoria exacta: ");
        
        CategoriaProducto categoria = null;
        
        //el try/catch convierte el texto que ingreso el usuario en una categoria del enum
        // .valueOf convierte el texto ingresado a un enum, si el texto coincide exactamente
        try {
            categoria = CategoriaProducto.valueOf(categoriaBuscada);
        } catch (IllegalArgumentException e) {
            Consola.escribir("Categoría inválida, se omite el filtro.");
        }

        if (categoria != null) {
            ArrayList<Producto> filtrados = inventario.filtrarPorCategoria(categoria);
            Consola.escribir("\nProductos en categoría " + categoria + ":\n");
        // .isEmpty() es un metodo de ArrayList que significa: ¿La lista esta vacia?
        // es lo mismo que filtrados.size() == 0
            if (filtrados.isEmpty()) {
                Consola.escribir("No hay productos en esta categoría.");
            } else {
                for (Producto p : filtrados) {
                    p.mostrarInfo();
                }
            }
        }
        // 5.	Eliminar un producto por su ID y listar los productos restantes.
        Consola.escribir("\n\n------ Eliminar producto por ID ------");
        String idEliminar = Consola.leer("Ingrese el ID: ");
        
        boolean eliminado = inventario.eliminarProducto(idEliminar);
        Consola.escribir("¿Se elimino?: " + eliminado);
        
        Consola.escribir("Lista de productos luego de eliminar: ");
        inventario.listarProductos();
        
        // 6.	Actualizar el stock de un producto existente.
        Consola.escribir("\n\n------ Actualizar stock de un producto existente ------");
        String idActualizar = Consola.leer("Ingrese el ID del producto: ");
        int nuevoStock = Consola.leerEntero("Ingrese nuevo stock: ");
        
        boolean actualizado = inventario.actualizarStock(idActualizar, nuevoStock);
        // expresion ternaria -> condicion ? valor_si_true : valor_si_false, es equivalente al if - else
        Consola.escribir(actualizado ? "Stock actualizado" : "Producto no encontrado");
        
        // 7.	Mostrar el total de stock disponible.  
        Consola.escribir("\n\n------ Total de stock disponible ------");
        int totalStock = inventario.obtenerTotalStock();
        Consola.escribir("Stock total en inventario: " + totalStock);
        
        // 8.	Obtener y mostrar el producto con mayor stock.  
        Consola.escribir("\n\n------ Producto con mayor stock ------");
        Producto maxProducto = inventario.obtenerProductoConMayorStock();
        if (maxProducto != null) {
            Consola.escribir("Producto con mayor stock: ");
            maxProducto.mostrarInfo();
        } else {
            Consola.escribir("No hay productos en el inventario.");
        }
        // 9.	Filtrar productos con precios entre $1000 y $3000.  
        Consola.escribir("\n\n------ Filtro de precio entre $1000 y $3000 ------");
        ArrayList<Producto> precios = inventario.filtrarProductosPorPrecio(1000.0, 3000.0);
        
        if (precios.isEmpty()) {
            Consola.escribir("No hay productos en ese rango de precio");
        } else {
            for (Producto p : precios) {
                p.mostrarInfo();
            }
        }
        
        // 10.	Mostrar las categorías disponibles con sus descripciones. 
        Consola.escribir("\n\n------ Categorias disponibles ------");
        inventario.mostrarCategoriasDisponibles();
        
        // Extra: prueba de toString()
        Consola.escribir("\n\n ------ Extra, prueba toString() -------");
        Consola.escribir(p5);
        
        Consola.escribir("\n\n------ Fin del programa ------");
    }
}
