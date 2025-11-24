package Parte02;

import java.util.Scanner;

/**
 *
 * @author Astrid
 */
public class PruebaEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una edad: ");
        int edad = sc.nextInt();
        
        try {
            ValidadorEdad.validarEdad(edad);
            System.out.println("Edad valida.");
            
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
        }
    }