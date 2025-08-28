/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

/**
 *
 * @author Astrid
 */
public class Recursividad {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialRecur(5));
   } //cierre de main
    
    static int factorial(int x) {
    int f = 1;
        for (int i = 1; i <= x; i++) {
            f *= i;
        }
        return f;
    }
    
    static int factorialRecur(int x) {
        if (x == 0) {
            return 1;
        } else {
            return x * factorialRecur(x - 1); 
        }
        
    }
    
} //cierre de class
