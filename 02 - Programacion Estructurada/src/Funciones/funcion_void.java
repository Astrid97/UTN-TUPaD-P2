/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

/**
 *
 * @author Astrid
 */
public class funcion_void {
    public static void main(String[] args) { 
        imprimirSimbolo('$', 10);
        imprimirSimbolo('x', 10);
        imprimirSimbolo('!', 10);
        imprimirSimbolo('@', 10);
        
    } // cierre main
    
    static void imprimirSimbolo(char simbolo, int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.print(simbolo);
            
        }
        System.out.println(); //salto de linea
    }
} // cierre class
