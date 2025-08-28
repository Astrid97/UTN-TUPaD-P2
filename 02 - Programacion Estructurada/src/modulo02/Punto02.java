/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo02;

import java.util.Scanner;

/**
 * Escribe un programa en Java que pida al usuario tres números enteros y determine cuál es el mayor.   
 * @author Astrid
 */
public class Punto02 {
    public static void main(String[] args) {
        int num1, num2, num3;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        num1 = input.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = input.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        num3 = input.nextInt();
        
        // verifico las opciones que se podrian dar
        if (num1 == num2 && num2 == num3) {
            System.out.println("Los tres números son iguales: " + num1);
        } else if (num1 >= num2 && num1 >= num3) {
            System.out.println("El mayor es: " + num1);  
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("El mayor es: " + num3);
        }
        
        
    }
}
