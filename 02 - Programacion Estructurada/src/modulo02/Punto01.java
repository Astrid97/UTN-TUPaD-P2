package modulo02;

import java.util.Scanner;

/**
 * Verificación de Año Bisiesto.  
 * Escribe un programa en Java que solicite al usuario un año 
 * y determine si es bisiesto. Un año es bisiesto si es divisible por 4,
 * pero no por 100, salvo que sea divisible por 400.  
 * @author Astrid
 */
public class Punto01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese un anio: ");
        int anio = scan.nextInt();
        
        if (esBisiesto(anio)) {
            System.out.println("¡" + anio + " es Bisiesto!");
        } else {
            System.out.println(anio + " no es Bisiesto.");
        }
    } //cierre de main
    
    static boolean esBisiesto(int n) {
        boolean esMultiploDe4 = n % 4 == 0;
        boolean esMultiploDe100 = n % 100 == 0;
        boolean esMultiploDe400 = n % 400 == 0;
        boolean esExcepcion = esMultiploDe100 && !esMultiploDe400;
        
        return esMultiploDe4 && !esExcepcion;
        
    /* tambien puedo simplificar la funcion de esta manera: 
        static boolean esBisiesto(int n) {
            return (n % 4 == 0) && (n % 100 != 0 || n % 400 == 0);
        }
    */
   
    }
    
    
} //cierre de class
