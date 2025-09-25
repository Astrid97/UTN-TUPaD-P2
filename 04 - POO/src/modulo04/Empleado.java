package modulo04;

/**
 *
 * @author Astrid
 */
public class Empleado {
    private int id; // Identificador único del empleado. 
    private String nombre; // Nombre completo. 
    private String puesto; // Cargo que desempeña. 
    private double salario; //Salario actual. 
    private static int totalEmpleados; // Contador global de empleados creados. 
    
    //constructor completo
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    
    //constructor reducido
    public Empleado(String nombre, String puesto) {
        totalEmpleados++;
        this.id = totalEmpleados; //id se asigna automaticamente por el contador
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 0.0;
    }
    
    //metodo sobrecargado: actualizarSalario
    //aumenta por porcentaje 
    public void actualizarSalario(double porcentaje){
        this.salario += this.salario * (porcentaje / 100.0);
    }
    
    //por monto fijo
    public void actualizarSalario(int montoFijo){
        this.salario += montoFijo;
    }
    
    // toString()

    @Override
    public String toString() {
        return "Empleado {" + "id = " + id + ", nombre = " 
                + nombre + ", puesto = " + puesto + ", salario = " + salario + '}';
        
    }
    
    //metodo estatico mostrar empleado
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    // Getters && Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
