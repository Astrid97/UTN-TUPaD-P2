/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_varios;

import java.util.Scanner;

/**
 *
 * @author Astrid
 */
public class do_while {
    static final int CORTE = 0;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, cont = 0;
        
        do {
            System.out.print("Ingresa un numero(" + CORTE + " para cortar): ");
            num = Integer.parseInt(input.nextLine());
            cont++; // cont = cont + 1;
        } while(num != CORTE);
                
        
        System.out.println("Cantidad de valores leidos: " + cont);
        
    }
    
}
