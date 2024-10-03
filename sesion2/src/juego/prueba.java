package juego;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CREAR UN OBJETO DE LA CLASE COCHE y enviando los parametros
		Coche coche1 = new Coche("FERRARI", 100, 1000);	
		coche1.encender(); //llamar una funcion (metodo)para que ocurra algo
		coche1.acelerar();
		coche1.frenar();
		//acceso de un atributo a travez de los getters y setters
		coche1.setModelo("NISSAN QASQAI");
		//acceso a un atributo publico
		coche1.color = "rojo";
		
	}
}
