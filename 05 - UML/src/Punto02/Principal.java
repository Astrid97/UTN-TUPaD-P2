package Punto02;

/**
 *
 * @author Astrid
 */
public class Principal {
    public static void main(String[] args) {
        Bateria bat1 = new Bateria("Samsung-EB-BG950", 3000);
        Usuario usr1 = new Usuario("Anakin Skywalker", "45123890");
        Celular cel1 = new Celular("356789123456789", "Samsung", "Galaxy S8");
        cel1.setBateria(bat1);
        cel1.setUsuario(usr1);

        cel1.mostrarInfo();
    }
}
