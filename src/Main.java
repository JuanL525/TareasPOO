import java.util.Scanner;
// paquete estandar de java Scanner
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //creacion de un objeto Scanner que lee desde la consola

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // lee la línea de texto

        System.out.print("Ingresa tu nota en programacion (sobre 10): ");
        double nota1 = scanner.nextDouble(); // lee un número decimal
        System.out.print("Ingresa tu nota en arquitectura (sobre 10): ");
        double nota2 = scanner.nextDouble();
        System.out.print("Ingresa tu nota en redes (sobre 10): ");
        double nota3 = scanner.nextDouble();

        double promedio=((nota1+nota2+nota3)/3);

        System.out.println("Hola " + nombre + ", tienes un promedio de: " + promedio);

        if (promedio>=7){
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}
