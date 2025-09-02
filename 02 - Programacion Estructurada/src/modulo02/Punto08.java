/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo02;

import java.util.Scanner;

/**
 * Cálculo del Precio Final con impuesto y descuento. 
 * Crea un método calcularPrecioFinal(double impuesto, double descuento) 
 * que calcule el precio final de un producto en un e-commerce. 
 * La fórmula es:
 * PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
 * PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times Descuento)
 * Desde main(), solicita el precio base del producto, el porcentaje de impuesto y el 
 * porcentaje de descuento, llama al método y muestra el precio final.  
 * @author Astrid
 */
public class Punto08 {
    public static void main(String[] args) {
        double precioBase, impuesto, descuento, precioFinal;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el impuesto en porcentaje (Ej 10 para 10%: ");
        impuesto = Double.parseDouble(input.nextLine()) /100;
        
        System.out.print("Ingrese el descuento en porcentaje (Ej 5 para 5%): ");
        descuento = Double.parseDouble(input.nextLine()) /100;
        
        precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        
        System.out.println("El precio final del producto es: " + precioFinal);
    } //cierre main
    
    //funcion
    static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        
        return precioFinal; 
    }
    
} //cierre class
