//Números primos:Escribe un programa que incluya una función para verificar si un número es
//primo y otra función para imprimir todos los números primos entre 1 y un número dado n.
package sesion1;

import java.util.Scanner;

public class act1_num_primos {
	public static boolean Numprimo (int num) {
		if(num < 2 ) {
			return false;
		}
		for(int i = 2;i < num ; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void mostrarmunprimos (int num_primo) {
		for(int num = 2; num <= num_primo; num++ ) {
			if (Numprimo(num)) {
				System.out.println("el numero:  "+ num + " es primo");
			}
		}
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese el numero: ");
		int num_primo = entrada.nextInt();
		mostrarmunprimos(num_primo);
	}
}


