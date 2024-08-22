package ejercicios1_sesion1;

import java.util.Scanner;

public class ejercicio4 {
    public static double menor(double num1, double num2, double num3) {
        double menor = num1;  
        if (num2 < menor) {
            menor = num2;  
        }       
        if (num3 < menor) {
            menor = num3;  
        }
        return menor;  
    }
    
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el primer numero:");
        double num1 = scanner.nextDouble();
        System.out.println("ingrese el segundo numero:");
        double num2 = scanner.nextDouble();        
        System.out.println("ingrese el tercer numero:");
        double num3 = scanner.nextDouble();

        double menorNumero = menor(num1, num2, num3);
        System.out.println("el menor numero es: " + menorNumero);
        
        scanner.close();
    }
}
