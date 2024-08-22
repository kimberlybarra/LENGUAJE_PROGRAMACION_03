package ejercicios1_sesion1;

import java.util.Scanner;

public class ejercicio2 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] num = new int[10];
	        
	        System.out.println("ingrese un numero:");
	        int ultimoNumero = scanner.nextInt();  
	        num[0] = ultimoNumero;
	        
	        for (int i = 1; i < 10; i++) {
	            int numero;
	            do {
	                System.out.println("ingrese un numero mayor que " + ultimoNumero + ":");
	                numero = scanner.nextInt();
	            } while (numero <= ultimoNumero);  
	            
	            num[i] = numero;
	            ultimoNumero = numero;  
	        }

	        System.out.println("los numeros ingresados son:");
	        for (int i = 0; i < 10; i++) {
	            System.out.print(num[i] + " ");
	        }
	    }
}
