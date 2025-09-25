package modulo04;

/**
 *
 * @author Astrid
 */
public class Modulo04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado(2025, "Boyd Crowder", "Desarrollador", 4500000);
        Empleado e2 = new Empleado("Raylan Givens", "Soporte");
        e2.setSalario(3900000);
        Empleado e3 = new Empleado("Winona Hawkins", "Disenio");
        e3.setSalario(3500000);
        
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        
        //actualizo salario
        e1.actualizarSalario(20.0);   // +20% (double)
        e2.actualizarSalario(500000);  // +$500.000 (int, monto fijo)
        e3.actualizarSalario(35.0);    // +35%
        
        System.out.println("-------------------------------");
        System.out.println("Actualizacion de salarios: ");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println("");

        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
    }  
}
