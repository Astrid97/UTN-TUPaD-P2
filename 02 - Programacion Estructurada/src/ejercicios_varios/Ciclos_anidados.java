package ejercicios_varios;

import java.util.Scanner;

/**
 * @author Astrid
 * Enunciado: Desarrollar un algoritmo que permita ingresar un ancho y un alto
 * (ambos numeros deben ser positivos). La computadora debe dibujar una matriz 
 * de cruces en la consola de tales dimensiones.
 * ej: Se ingresa 7 de ancho y 4 de alto. se imprime 
 * xxxxxxx
 * xxxxxxx
 * xxxxxxx
 * xxxxxxx
 */
public class Ciclos_anidados {
    
    final static char CARACTER = 'X'; //char es con comillas simples
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ancho, alto;
        
        System.out.print("Ingresa el ancho: ");
        ancho = Integer.parseInt(input.nextLine());
        while (ancho <= 0) {
            System.out.print("Error. Ingresa el ancho: ");
            ancho = Integer.parseInt(input.nextLine());
            
        }
        
        System.out.print("alto el alto: ");
        alto = Integer.parseInt(input.nextLine());
        while (alto <= 0) {
            System.out.print("Error. Ingresa el alto: ");
            alto = Integer.parseInt(input.nextLine());
        
        } 
        //se podria resumir escribiendo una funcion 
        //la mejor manera de hacer las impresiones es con for
        
        for (int t = 0; t <= alto; t++) { //el for va a repetir tantas veces como diga el alto
            for (int i = 1 ; i <= ancho; i++) { //el char se imprime tantas veces como diga el ancho
                System.out.print(CARACTER);
            } 
            System.out.println(); //salto de linea para la proxima fila
        }       
    }
    
}
    

