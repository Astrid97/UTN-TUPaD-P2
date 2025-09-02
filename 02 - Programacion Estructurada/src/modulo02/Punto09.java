/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo02;

import java.util.Scanner;

/**
 * Composición de funciones para calcular costo de envío y total de compra.
 * a. calcularCostoEnvio(double peso, String zona): Calcula el costo de envío basado en 
 * la zona de envío (Nacional o Internacional) y el peso del paquete. 
 * Nacional: $5 por kg || Internacional: $10 por kg
 * 
 * b. calcularTotalCompra(double precioProducto, double costoEnvio): Usa calcularCostoEnvio para 
 * sumar el costo del producto con el costo de envío. 
 * Desde main(), solicita el peso del paquete, la zona de envío y el precio del producto. 
 * Luego, muestra el total a pagar.
 * 
 * @author Astrid
 */
public class Punto09 {
    public static void main(String[] args) {
        double peso, precioProducto, costoEnvio, precioFinal;
        String zona;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el peso del paquete: ");
        peso = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        zona = input.nextLine();
        
        costoEnvio = calcularCostoEnvio(peso, zona);
        
        if (costoEnvio == -1) {
            System.out.println("Zona invalida. No se puede calcular el envio");    
        } else {
            precioFinal = calcularTotalCompra(precioProducto, costoEnvio);
            System.out.println("El costo de envio es: " + costoEnvio);
            System.out.println("El total a pagar es: " + precioFinal);
        }   
    } //cierre main
    
    static double calcularCostoEnvio(double peso, String zona){
        double costoEnvio;
        if (zona.equalsIgnoreCase("nacional")) {
          costoEnvio = 5 * peso;   
        } else if (zona.equalsIgnoreCase("internacional")) {
            costoEnvio = 10 * peso;
        } else {
            costoEnvio = -1;
        }
        return costoEnvio;
    }
    
    static double calcularTotalCompra(double  precioProducto, double costoEnvio) {
        double totalCompra = precioProducto + costoEnvio;
        return totalCompra;
        
    }
   
} //cierre class
