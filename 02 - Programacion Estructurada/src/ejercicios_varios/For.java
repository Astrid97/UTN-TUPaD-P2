/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_varios;

import java.util.Scanner;

/**
 *
 * @author Astrid
 */
public class For { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.print("Ingresa un numero positivo: ");
        num = Integer.parseInt(input.nextLine());
        
        if (num > 0 ) {
            if (num % 2 != 0) { //si es impar
                num--; 
        }
            for (int cont = num; cont >= 0; cont -= 2) {
                System.out.print(cont + " ");
          
            }
        
        System.out.println(); //Solo salto de linea
        
    } else {
        System.out.println("El numero debia ser positivo.");
        }
    
}
}