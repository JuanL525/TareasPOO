import java.util.Scanner;

class Empleado {
    String nombre;
    String cargo;
    double salario;
    String fechaIngreso;

    public Empleado(String nombre, String cargo, double salario, String fechaIngreso) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: $" + salario);
        System.out.println("Fecha de Ingreso: " + fechaIngreso);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado[] empleados = new Empleado[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese los detalles del empleado " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();
            System.out.print("Salario: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // Consumir la nueva línea después de leer el double
            System.out.print("Fecha de Ingreso (YYYY-MM-DD): ");
            String fechaIngreso = scanner.nextLine();
            empleados[i] = new Empleado(nombre, cargo, salario, fechaIngreso);
            System.out.println();
        }

        System.out.println("\nInformación de los empleados:");
        for (Empleado empleado : empleados) {
            empleado.mostrarInformacion();
        }

        scanner.close();
    }
}