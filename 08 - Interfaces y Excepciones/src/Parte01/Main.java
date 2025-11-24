package Parte01;

/**
 *
 * @author Astrid
 */
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Astrid", "Astrid@example.com");
        
        Pedido pedido = new Pedido(cliente);
        
        pedido.agregarProducto(new Producto("Proteina Whey", 40000));
        pedido.agregarProducto(new Producto("Creatina", 25000));
        
        System.out.println("------ Detalle del pedido ------");
        for (Producto p : pedido.getProductos() ) {
            System.out.println(p);
        }
        
        System.out.println("Total del pedido: $" + pedido.calcularTotal());
        
        pedido.setEstado("PAGADO");
        
        PagoConDescuento medioPago = new TarjetaCredito("1234-5678-9100-1111", 0.10);
        medioPago.procesarPago(pedido.calcularTotal());
    }
    
}
