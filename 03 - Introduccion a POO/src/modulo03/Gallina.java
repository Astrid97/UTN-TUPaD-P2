package modulo03;

/**
 *
 * @author Astrid
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    public void ponerHuevo(){
        //suponiendo que cada año de vida produce 250 huevos
        huevosPuestos = edad * 250;
    }
    
    public void envejecer() {
        edad++;
    }
    
    public void mostrarEstado() {
        System.out.println("ID Gallina: " + idGallina);
        System.out.println("Edad: " + edad + " anios");
        System.out.println("Huevos puestos: " + huevosPuestos);
        System.out.println("-------------------");
    }
}
