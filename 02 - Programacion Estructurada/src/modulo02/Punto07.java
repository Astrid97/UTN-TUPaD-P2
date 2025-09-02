/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo02;

import java.util.Scanner;

/**
 * Validación de Nota entre 0 y 10 (do-while). 
 * Escribe un programa que solicite al usuario una nota entre 0 y 10. 
 * Si el usuario ingresa un número fuera de este rango, debe seguir 
 * pidiéndole la nota hasta que ingrese un valor válido.  
 * @author Astrid
 */
public class Punto07 {
    public static void main(String[] args) {
        int nota;
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = Integer.parseInt(input.nextLine());
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);
        System.out.print("Nota guardada correctamente.");
    }
}
