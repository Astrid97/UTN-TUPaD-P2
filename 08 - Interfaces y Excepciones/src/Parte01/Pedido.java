package Parte01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Astrid
 */
public class Pedido implements Pagable {
    
    private final List<Producto> productos = new ArrayList<>();
    private Cliente cliente;
    private String estado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.estado = "Creado";
    }
    
   public void agregarProducto(Producto producto) {
       productos.add(producto);
   }

    public List<Producto> getProductos() {
        return productos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        
        if (cliente != null) {
            cliente.notificar("\n Tu pedido cambio de estado a: " + estado);
        }
        
    }
  
    @Override
    public double calcularTotal() {
        double total = 0.0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
        
    }

    @Override
    public String toString() {
        return "Pedido de " + (cliente != null ? cliente.getNombre() : "N/D")
                + " - Estado: " + estado
                + " - Total: $" + calcularTotal();
    }
    
}
