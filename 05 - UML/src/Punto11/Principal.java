package Punto11;

/**
 *
 * @author Astrid
 */
public class Principal {
    public static void main(String[] args) {
        Artista art = new Artista("Christina Aguilera", "Pop");
        Cancion tema = new Cancion("Genio Atrapado", art);

        Reproductor rep = new Reproductor();
        rep.reproducir(tema);  // dependencia de uso: pasa la cancion, no la guarda
    }
}
