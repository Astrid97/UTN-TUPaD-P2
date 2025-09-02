/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo02;

import java.util.Scanner;

/**
 * Cálculo de descuento especial usando variable global.
 * Declara una variable global Ejemplo de entrada/salida: = 0.10. 
 * Luego, crea un método calcularDescuentoEspecial(double precio) 
 * que use la variable global para calcular el descuento especial del 10%.  
 * Dentro del método, declara una variable local descuentoAplicado, almacena el valor 
 * del descuento y muestra el precio final con descuento.  
 * @author Astrid
 */
public class Punto11 {
    static double descuento = 0.10; //variable global
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();

        calcularDescuentoEspecial(precio);
    } //cierre main
    
    static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * descuento; //variable local
        double precioFinal = precio - descuentoAplicado;

        System.out.println("Precio original: " + precio);
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
} // cierre class

