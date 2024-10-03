package actividades;

import actividades.actividad3.Automovil;
import actividades.actividad3.Motor;

public class TestAgregacion {
	public static void main(String[] args) {
        actividad3 actividad = new actividad3();  

        Motor motor1 = actividad.new Motor(45727, 4000);
        Automovil auto1 = actividad.new Automovil("V7V755", 4, "Toyota", "Corolla");

        auto1.setMotor(motor1);

        System.out.println(auto1.toString());
    }
}
