/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo01;

import java.util.Scanner;

/**
 *
 * @author Astrid
 */
public class Punto08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, division;
        System.out.print("Ingrese el primer numero entero: ");
        num1 = input.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        num2 = input.nextInt();
        
        division = num1 / num2;
        
        System.out.println("El resultado de la division es: " + division);
       
    }
    
}
