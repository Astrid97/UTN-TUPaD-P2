package Punto11;

/**
 *
 * @author Astrid
 */
public class Reproductor {
    // Dependencia de uso: usa Cancion como parametro, NO la guarda como atributo.
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo() +
                " - " + cancion.getArtista().getNombre() +
                " (" + cancion.getArtista().getGenero() + ")");
    }
}
