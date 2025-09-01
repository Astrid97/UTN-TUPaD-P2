/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo02;

import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).  
 * Luego, aplique los siguientes descuentos: 
 * Categoría A: 10% de descuento  
 * Categoría B: 15% de descuento
 * Categoría C: 20% de descuento 
 * El programa debe mostrar el precio original, el descuento aplicado y el precio final
 * @author Astrid
 */
public class Punto04 {
    public static void main(String[] args) {
        double precio, precioDescuento;
        char categoria;
        String descAplicado;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        categoria = Character.toUpperCase(input.nextLine().charAt(0));
        
        switch (categoria) {
            case 'A':
                descAplicado = "10%";
                precioDescuento = precio - ( precio * 0.10);
                break;
            case 'B':
                descAplicado = "15%";
                precioDescuento = precio - ( precio * 0.15);
                break;
            case 'C':
                descAplicado = "20%";
                precioDescuento = precio - ( precio * 0.20);
                break;
            default:
                descAplicado = "Sin descuento.";
                precioDescuento = precio;
                break;    
        }
        System.out.println("Precio Original: " + precio + "\nDescuento aplicado: " + descAplicado);
        System.out.println("Precio final: " + precioDescuento);
                
    }
 
}
