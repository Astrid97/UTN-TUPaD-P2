package pkg03.introduccion.a.poo;

/**
 *
 * @author Astrid
 */
public class Auto {
    String patente;
    String color;
    int kms;
    boolean conAire;

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
     
    void mostrarDatos() {
        System.out.println(patente + " " + color + " " + kms + " " + conAire);
    }
    
    
}
