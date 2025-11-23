package Punto03;

import java.util.ArrayList;

/**
 *
 * @author Astrid
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new EmpleadoPlanta("Ana", 300000));
        empleados.add(new EmpleadoTemporal("Luis", 80, 2500));
        empleados.add(new EmpleadoPlanta("Carlos", 280000));
        empleados.add(new EmpleadoTemporal("Marta", 120, 2200));
        
        for (Empleado e : empleados) {
            System.out.println(e);
            
            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Planta Permanente");
                
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Temporal por hora");
                
            }
            System.out.println("--------------------------------");
        }
    }  
}
