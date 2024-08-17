package sesion1;

import java.util.Scanner;

public class area_rectangulo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);//creamos un objeto nuevo
		System.out.println("ingrese la base: ");
		int base = entrada.nextInt(); //entrada.nextInt guarda lo que entra el usuario
		System.out.println("ingrese la altura: ");
		int altura = entrada.nextInt();
		System.out.println("el area del rectangulo es:  " + base * altura);
		
	}
}
