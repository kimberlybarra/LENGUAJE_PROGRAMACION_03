package ejercicios1_sesion1;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de horas: ");
        int horas = scanner.nextInt();
        System.out.print("Ingresa el número de minutos: ");
        int min = scanner.nextInt();
        System.out.print("Ingresa el número de segundos: ");
        int seg = scanner.nextInt();

        int totalSegundos = (horas * 3600) + (min * 60) + seg;

        System.out.println("El equivalente en segundos es: " + totalSegundos);
    }
}
