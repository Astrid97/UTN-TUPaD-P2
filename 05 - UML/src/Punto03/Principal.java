package Punto03;

/**
 *
 * @author Astrid
 */
public class Principal {
    public static void main(String[] args) {
        Autor autor = new Autor("Joe Dispenza", "Estadounidense");
        Editorial ed = new Editorial("Urano", "Calle Aragon 366, 08009 Barcelona, España");

        Libro libro = new Libro("El Placebo Eres Tu", "9788417545789");
        libro.setAutor(autor);          // Libro → Autor (unidireccional)
        libro.setEditorial(ed);         // Libro ◇→ Editorial (agregacion)

        libro.mostrarFicha();
    }
}