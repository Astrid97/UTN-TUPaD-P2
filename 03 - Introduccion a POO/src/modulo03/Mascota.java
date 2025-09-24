package modulo03;

/**
 *
 * @author Astrid
 */
public class Mascota {
    private String nombre;
    private int edad;
    private String especie;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " anios");
        System.out.println("Especie: " + especie);
    }
    
    public void cumplirAnios(){
        this.edad++;
        System.out.println(nombre + " cumplio anios. Ahora tiene " + edad + " anios");
    } 
    
}
