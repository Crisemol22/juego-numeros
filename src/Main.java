
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

          int numeroAleatorio = random.nextInt(100);
        int intentos = 0;
        int numerosIgresados = 0;


        System.out.println("Bienvenido al juego de adivinar el número");
        System.out.println("Tienes que adivinar un número entre 0 y 100.");

        while (numerosIgresados != numeroAleatorio) {
            System.out.print("Ingresa tu número: ");
            numerosIgresados = scanner.nextInt();
            intentos++;;

            if (numerosIgresados < numeroAleatorio) {
                System.out.println("El número ingresado es menor que el número .");
            } else if (numerosIgresados > numeroAleatorio) {
                    System.out.println("El número ingresado es mayor que el número .");
            }
        }

        System.out.println(" adivinado el número " + numeroAleatorio + " en " + intentos + " intentos.");
        scanner.close();;
    }
}