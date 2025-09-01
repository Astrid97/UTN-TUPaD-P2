/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo02;

import java.util.Scanner;

/**
 * Suma de Números Pares (while). Escribe un programa que solicite números al usuario 
 * y sume solo los números pares. El ciclo debe continuar hasta que el usuario ingrese 
 * el número 0, momento en el que se debe mostrar la suma total de los pares ingresados.  
 * @author Astrid
 */
public class Punto05 {
    public static void main(String[] args) {
        int num, suma;
        suma = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Este programa solo sumara numeros pares mayores a cero");
        
        System.out.print("Ingrese un numero mayor a cero: ");
        num = Integer.parseInt(input.nextLine());
        
        while (num != 0) {
            if (num % 2 == 0) {
                suma += num;
        }
            System.out.print("Ingrese un numero (0 para terminar): ");
            num = Integer.parseInt(input.nextLine());
        }
        
        System.out.println("La suma de los numeros pares es: " + suma);
    }
    
}
