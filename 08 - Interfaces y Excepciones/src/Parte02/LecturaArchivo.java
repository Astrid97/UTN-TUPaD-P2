package Parte02;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Astrid
 */
public class LecturaArchivo {
    
    public static void main(String[] args) {
        try {
            File archivo = new File("archivo.txt"); 
            Scanner sc = new Scanner(archivo);

            System.out.println("Contenido del archivo:");

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo no existe o no puede ser leido.");
        }
    }
}
