import java.util.Scanner;
// paquete estandar de java Scanner
public class Equipo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //creacion de un objeto Scanner que lee desde la consola

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // lee la línea de texto
        System.out.print("Ingresa tu edad: ");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingresa tu altura: ");
        double altura = Double.parseDouble(scanner.nextLine());

        if (edad>=18 && altura>=1.60){
            System.out.print(nombre +" Haz sido aceptado en el equipo");
        } else {
            System.out.print(nombre +" No cumple los requisitos");
        }
    }
}