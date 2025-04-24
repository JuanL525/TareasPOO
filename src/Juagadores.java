import java.util.Scanner;

class Jugador {
    String nombre;
    String posicion;
    int edad;
    int numeroCamiseta;

    public Jugador(String nombre, String posicion, int edad, int numeroCamiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.numeroCamiseta = numeroCamiseta;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Posición: " + posicion);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Número de Camiseta: " + numeroCamiseta);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jugador[] jugadores = new Jugador[3];

        // Datos quemados iniciales para los nombres y posiciones
        String[] nombresBase = {"Lionel", "Kylian", "Neymar"};
        String[] posicionesBase = {"Delantero", "Delantero", "Delantero"};

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese los detalles adicionales para el jugador " + nombresBase[i] + ":");
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            System.out.print("Número de Camiseta: ");
            int numeroCamiseta = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            jugadores[i] = new Jugador(nombresBase[i], posicionesBase[i], edad, numeroCamiseta);
            System.out.println();
        }

        System.out.println("\nInformación de los jugadores del equipo:");
        for (Jugador jugador : jugadores) {
            jugador.mostrarInformacion();
        }

        scanner.close();
    }
}