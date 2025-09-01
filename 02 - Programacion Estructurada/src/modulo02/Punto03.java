/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo02;

import java.util.Scanner;

/**
 * Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida según la siguiente tabla:
 * Menor de 12 años: "Niño"  
 * Entre 12 y 17 años: "Adolescente"  
 * Entre 18 y 59 años: "Adulto"  
 * 60 años o más: "Adulto mayor"  
 * @author Astrid
 */
public class Punto03 {
    public static void main(String[] args) {
        int edad;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        edad = input.nextInt();
        
        if (edad >= 0) {
            if (edad < 12) {
                System.out.println("Eres un niño");
            } else if ( edad >= 12 && edad <= 17) {
                System.out.println("Eres un Adolescente");
            } else if ( edad >= 18 && edad <= 59 ) {
                System.out.println("Eres un Adulto");
            } else {
                System.out.println("Eres un Adulto mayor");
            }        
        } else {
            System.out.println("Incorrecto, ingrese un numero mayor o igual a 0");
        }
            
    }
}