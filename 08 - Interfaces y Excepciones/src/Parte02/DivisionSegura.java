package Parte02;

import java.util.Scanner;

/**
 *
 * @author Astrid
 */
public class DivisionSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Ingrese el numerador: ");
            int a = sc.nextInt();
            
            System.out.println("Ingrese el denominador: ");
            int b = sc.nextInt();
            
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
            
        } catch (ArithmeticException ae) {
            System.out.println("Error: no se puede dividir por cero.");
        }
    }
}
