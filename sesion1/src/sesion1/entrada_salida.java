package sesion1;

import java.util.Scanner;

public class entrada_salida {
	public static void main(String[] args) {
		Scanner myOb = new Scanner(System.in);
		System.out.println("ingrese su nombre: ");
		String userNombre = myOb.nextLine();
		
		System.out.println("ingrese edad: ");
		int userEdad = myOb.nextInt();
		System.out.println("usuario es: " + userNombre + " y tiene la edad de: " + userEdad);
	}
}
