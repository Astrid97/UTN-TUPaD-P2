/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo02;

import java.util.Scanner;

/**
 * Contador de Positivos, Negativos y Ceros (for). 
 * Escribe un programa que pida al usuario ingresar 10 números enteros 
 * y cuente cuántos son positivos, negativos y cuántos son ceros.  
 * @author Astrid
 */
public class Punto06 {
    public static void main(String[] args) {
        int num, positivos, negativos, ceros;
        Scanner input = new Scanner(System.in);
        positivos = 0;
        negativos = 0;
        ceros = 0;
        for (int i = 1; i < 11; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            num = Integer.parseInt(input.nextLine());
            if (num > 0) {
                positivos += 1;
            } else if (num < 0){
                negativos += 1;
            } else {
                ceros +=1;
            }
            
        }
        System.out.println("Resultados: \nPositivos: " + positivos);
        System.out.println("Negativos: " + negativos + "\nCeros: " + ceros);
        
    } //cierre main
} //cierre class
