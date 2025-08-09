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
public class Punto05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, suma, resta, multiplicacion, division;
        
        System.out.print("Ingrese el primer numero entero: ");
        num1 = input.nextInt();
        
        System.out.print("Ingrese el segundo numero entero: ");
        num2 = input.nextInt();
        
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
    }
}
