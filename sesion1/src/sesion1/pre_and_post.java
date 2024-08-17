package sesion1;

public class pre_and_post {
	public static void main(String[] args) {
		int a = 8;
		int b;
		
		b = ++a;
		System.out.println("prefijo: devuelve el valor incrementado.");
		System.out.println("valor de a: " + a);
		System.out.println("valor de b: " + b);
		
		a = 8;
		b= a++;
		System.out.println("postfijo: devuelve el valor original de ahi lo incrementa.");
		System.out.println("valor de a: " + a);
		System.out.println("valor de b: " + b);
		//no olvidar tener en cuanta las variables y el tipo
	}
}
