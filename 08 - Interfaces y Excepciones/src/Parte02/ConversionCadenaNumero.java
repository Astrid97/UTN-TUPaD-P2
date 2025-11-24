package Parte02;

import java.util.Scanner;

/**
 *
 * @author Astrid
 */
public class ConversionCadenaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        String texto = sc.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Numero convertido: " + numero);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: el texto ingresado no es un numero valido.");
        } 
    }
    
}
