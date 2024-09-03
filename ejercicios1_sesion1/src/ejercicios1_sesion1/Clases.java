package ejercicios1_sesion1;

import java.util.Scanner;

public class Clases {
    // Atributos (variables de instancia)
    private int numero;
    private String texto;

    // Constructor
    public Clases(int numero, String texto) {
        this.numero = numero;
        this.texto = texto;
    }

    // Método para obtener el valor del atributo 'numero'
    public int getNumero() {
        return numero;
    }

    // Método para establecer el valor del atributo 'numero'
    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Método para obtener el valor del atributo 'texto'
    public String getTexto() {
        return texto;
    }

    // Método para establecer el valor del atributo 'texto'
    public void setTexto(String texto) {
        this.texto = texto;
    }

    // Método que realiza una acción
    public void mostrarInformacion() {
        System.out.println("Número: " + numero);
        System.out.println("Texto: " + texto);
    }

    // Método para leer datos desde la entrada estándar
    public void leerDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        numero = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        System.out.print("Introduce un texto: ");
        texto = scanner.nextLine();
    }
}
