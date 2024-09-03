package juego; //carpeta donde se va a manejar

public class Coche {
	// Atributos
	public String color;
	private String modelo;
	private int velocidadMaxima;
	private int potenciaMotor;
	private boolean enMarcha;
	public String marca; //nuevos atributos
	public int aniofabricacion = 2008;
	public double precio;
	
	// Constructor no devuelve nada
	public Coche(String modelo, int velocidadMaxima, int potenciaMotor,String marca, int aniofabricacion, int precio) {
	this.modelo = modelo;
	this.velocidadMaxima = velocidadMaxima;
	this.potenciaMotor = potenciaMotor; //el this es para diferenciarlos
	this.enMarcha = false; // El coche comienza apagado
	}
	//constructor por defecto
	public Coche(){}  
	//constructor  con 4 parametros
	public Coche(String marca, int aniofabricacion, int precio) {
	this.marca = marca;
	this.aniofabricacion = aniofabricacion;
	this.precio = precio;
	}
	//acceso a un atributo privado a travez de un get y set 

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getmodelo() {
		return modelo;
	}
	
	// Metodos
	public void acelerar() {
		if (enMarcha) {
			System.out.println("El coche " + modelo + " esta acelerando.");
		} else {
			System.out.println("Primero enciende el coche.");
		}
	}
	public void frenar() {
		if (enMarcha) {
			System.out.println("El coche " + modelo + " esta frenando.");
		} else {
			System.out.println("El coche esta apagado, no se puede frenar.");
		}
	}
	public void encender() {
		enMarcha = true;
		System.out.println("El coche " + modelo + " se ha encendido.");
	}
	public void apagar() {
		enMarcha = false;
		System.out.println("El coche " + modelo + " se ha apagado.");
	}
	public void aplicarDescuento() { //metodo

		if (aniofabricacion < 2010) {
			System.out.println("El año de fabricacion es " + aniofabricacion + "es menor a 2010, si aplica descuento");			
		}
		else {
			System.out.println("no aplica descuento");
		}
		
	}
}

