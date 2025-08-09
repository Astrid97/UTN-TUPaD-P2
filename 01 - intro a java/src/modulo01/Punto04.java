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
public class Punto04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = input.nextLine();
        
        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
