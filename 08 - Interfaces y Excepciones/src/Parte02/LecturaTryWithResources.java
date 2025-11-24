package Parte02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Astrid
 */
public class LecturaTryWithResources {
    public static void main(String[] args) {
        String ruta = "archivo.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            
        } catch (IOException e) {
            System.out.println("Error leyendo el archivo: " + e.getMessage());
        }
        
    }
}
