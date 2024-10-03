package ejercicios1_sesion1;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horas, min, seg;

        //Validemos que las horas, minutos y segundo no sena negativas
        do {
            System.out.print("ingrese el numero de horas: ");
            horas = scanner.nextInt();
            if (horas < 0) {
                System.out.println("el numero de horas no puede ser negativo, intente nuevamente ");
            }
        } while (horas < 0);

        do {
            System.out.print("ingrese el numero de minutos: ");
            min = scanner.nextInt();
            if (min < 0) {
                System.out.println("el numero de minutos no puede ser negativo, intente nuevamente");
            }
        } while (min < 0);

        do {
            System.out.print("ingresa el numero de segundos: ");
            seg = scanner.nextInt();
            if (seg < 0) {
                System.out.println("el numero de segundos no puede ser negativo, intente nuevamente.");
            }
        } while (seg < 0);

        int totalSegundos = (horas * 3600) + (min * 60) + seg;

        System.out.println("en segundos es: " + totalSegundos);
        scanner.close();
    }
}

