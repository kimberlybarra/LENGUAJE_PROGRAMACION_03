package ejercicios1_sesion1;

import java.util.Scanner;

public class ejercicio5 {
    public static double calcularCargo(int horas) {
        double cargo;
        if (horas <= 1) {
            cargo = 3.00;  
        } else {
            cargo = 3.00 + (horas - 1) * 0.50;  
            if (cargo > 12.00) {
                cargo = 12.00;  
            }
        }
        return cargo;
    }
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero de horas de estacionamiento:");
        int horas = scanner.nextInt();
        
        double cargo = calcularCargo(horas);        
        System.out.println("el cargo es: " + cargo +" sole");   
        scanner.close();
    }
}

