package ejercicios_varios;

import java.util.Scanner;

/**
 *
 * @author Astrid
 */
 /* Desarrollar un algoritmo que permita ingresar dos numeros 
        enteros y un simbolo que indique una operacion matematica a
        realizar con ellos: */
public class Calculadora_simple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        char simbolo;
        
        System.out.print("Ingresa el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingresa el segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingresa un simbolo: ");
        simbolo = input.nextLine().charAt(0); //toma solo el primer caracter ingresado
        
        /* netbeans me ofrece la opcion de convertir el switch con 'reglas' (->) 
        que aparecio en Java 12+, la manera en la que esta escrita abajo es el switch clasico */
        switch (simbolo) {
            case '+': //comilla simple
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case '-': 
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 'x': 
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case '/': 
                if (num2 != 0) {
                System.out.println("Resultado: " + (num1 / num2));
               
                } else {
                    System.out.println("No se puede dividir por cero");
                }
                break;
            default:
                System.out.println("Operacion Invalida");
        }
        
     
    }
    
}
