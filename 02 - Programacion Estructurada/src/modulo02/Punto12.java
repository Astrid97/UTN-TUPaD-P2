/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo02;

/**
 * Arrays y Recursividad: 
 * Modificación de un array de precios y visualización de resultados. 
 * Crea un programa que:  
 * Declare e inicialice un array con los precios de algunos productos. 
 * Muestre los valores originales de los precios. 
 * Modifique el precio de un producto específico. 
 * Muestre los valores modificados.  
 * @author Astrid
 */
public class Punto12 {
    public static void main(String[] args) {
        //declaro e inicio un array 
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        //precios originales
        System.out.println("Precios originales: ");
        
        //for-each
        for (double i : precios) {
            System.out.println("Precio: $" + i);
        }
        
        //modifico el precio de un producto
        precios[2] = 129.99;
        
        //precios modificados
        System.out.println("Precios modificados: ");
        for (double i : precios) {
            System.out.println("Precios modificados: $" + i);
        }
        
    }
}
