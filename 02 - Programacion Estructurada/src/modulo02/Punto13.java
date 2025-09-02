/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo02;

/**
 * Impresión recursiva de arrays antes y después de modificar un elemento.  
 * Crea un programa que:  
 * Declare e inicialice un array con los precios de algunos productos.  
 * Use una función recursiva para mostrar los precios originales.  
 * Modifique el precio de un producto específico.  
 * Use otra función recursiva para mostrar los valores modificados.  
 * @author Astrid
 */
public class Punto13 {
     public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales: ");
        imprimirArray(precios, 0);

        // modificar precio
        precios[2] = 129.99;

        System.out.println("\nPrecios modificados: ");
        imprimirArray(precios, 0);
    }

    // funcion recursiva 
    static void imprimirArray(double[] precio, int indice) {
        if (indice == precio.length) {
            return; // caso base
        }
        System.out.println("Precio: $" + precio[indice]);
        imprimirArray(precio, indice + 1); // paso recursivo
    }
}
