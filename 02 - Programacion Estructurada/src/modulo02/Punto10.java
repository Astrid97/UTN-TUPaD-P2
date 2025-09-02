/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo02;

import java.util.Scanner;

/**
 * Actualización de stock a partir de venta y recepción de productos. 
 * Crea un método actualizarStock(int stockActual, int cantidadVendida,int cantidadRecibida),
 * que calcule el nuevo stock después de una venta y recepción de productos:  
 * NuevoStock = StockActual − CantidadVendida + CantidadRecibida  
 * NuevoStock = CantidadVendida + CantidadRecibida  
 * Desde main(), solicita al usuario el stock actual, la cantidad vendida y la cantidad recibida, 
 * y muestra el stock actualizado.  
 * @author Astrid
 */
public class Punto10 {
    public static void main(String[] args) {
        int stockActual, cantVendida, cantRecibida, stockActualizado;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el stock actual del producto: ");
        stockActual = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad vendida: ");
        cantVendida = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad recibida: ");
        cantRecibida = Integer.parseInt(input.nextLine());
        
        stockActualizado = actualizarStock(stockActual, cantVendida, cantRecibida);
        System.out.println("El nuevo stock del producto es: " + stockActualizado);
        
    } // cierre main
    static int actualizarStock(int stockActual, int cantVendida,int cantRecibida){
        
        int nuevoStock = stockActual - cantVendida + cantRecibida;  
                
        return nuevoStock;
    }
} //cierre class
