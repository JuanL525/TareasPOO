import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Preguntar cuántos números se van a ingresar
        System.out.print("¿Cuántos números vas a ingresar? ");
        int cantidad = scanner.nextInt();

        int pares = 0; // contador de números pares

        // Leer cada número usando un for
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            int numero = scanner.nextInt();
        //Comprobar que algun numero es par
            if (numero % 2 == 0) {
                pares++;
            }
        }

        // Mostrar cuántos números pares se ingresaron
        System.out.println("Se ingresaron " + pares + " número(s) par(es).");

        scanner.close();
    }
}

