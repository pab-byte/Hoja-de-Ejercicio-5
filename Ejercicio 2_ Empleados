import java.util.ArrayList;

class Empleado {
    private String nombre;
    private String departamento;
    private double salario;

    public Empleado(String nombre, String departamento, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getNombre() { return nombre; }
    public String getDepartamento() { return departamento; }
    public double getSalario() { return salario; }

    @Override
    public String toString() {
        return String.format("%s | %s | Q%.2f", nombre, departamento, salario);
    }
}

public class Ejercicio2_Empleados {

    /**
     * Devuelve un nuevo ArrayList con los empleados del departamento indicado
     * cuyo salario sea mayor a Q5,000.
     */
    public static ArrayList<Empleado> filtrarPorDepartamento(ArrayList<Empleado> empleados,
                                                             String departamento) {
        ArrayList<Empleado> resultado = new ArrayList<>();
        for (Empleado e : empleados) {
            if (e.getDepartamento().equalsIgnoreCase(departamento) && e.getSalario() > 5000) {
                resultado.add(e);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Ana Lopez", "Ventas", 6200));
        empleados.add(new Empleado("Carlos Perez", "Ventas", 4800));
        empleados.add(new Empleado("Maria Gomez", "Sistemas", 8500));
        empleados.add(new Empleado("Luis Ramirez", "Ventas", 5000));   // no cumple (no es > 5000)
        empleados.add(new Empleado("Sofia Castillo", "Ventas", 7300));

        ArrayList<Empleado> filtrados = filtrarPorDepartamento(empleados, "Ventas");

        System.out.println("Empleados de Ventas con salario > Q5,000:");
        filtrados.forEach(System.out::println);
    }
}
