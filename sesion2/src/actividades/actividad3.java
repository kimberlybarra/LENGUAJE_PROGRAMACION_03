package actividades;

public class actividad3 {
	public class Automovil {
        private String placa;
        private int numPuertas;
        private String marca;
        private String modelo;
        private Motor motor;
        
        public Automovil(String placa, int numPuertas, String marca, String modelo) {
            this.placa = placa;
            this.numPuertas = numPuertas;
            this.marca = marca;
            this.modelo = modelo;
        }
        //setters
        public void setPlaca(String placa) {
            this.placa = placa;
        }
        public void setNumPuertas(int numPuertas) {
            this.numPuertas = numPuertas;
        }
        public void setMarca(String marca) {
            this.marca = marca;
        }
        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
        public void setMotor(Motor motor) {
            this.motor = motor;
        }
        //getters
        public String getPlaca() {
            return placa;
        }
        public int getNumPuertas() {
            return numPuertas;
        }
        public String getMarca() {
            return marca;
        }
        public String getModelo() {
            return modelo;
        }
        public Motor getMotor() {
            return motor;
        }
        
        public String toString() {
            return "Automovil Placa: " + placa + ", Número de Puertas: " + numPuertas + 
                   ", Marca: " + marca + ", Modelo: " + modelo + ", numero " + motor.toString();
        }
    }

    public class Motor {
        private int numMotor;
        private int revPorMin;
        
        public Motor(int numMotor, int revPorMin) {
            this.numMotor = numMotor;
            this.revPorMin = revPorMin;
        }
        //setters
        public void setNumMotor(int numMotor) {
            this.numMotor = numMotor;
        }
        public void setRevPorMin(int revPorMin) {
            this.revPorMin = revPorMin;
        }
        //getters
        public int getNumMotor() {
            return numMotor;
        }
        public int getRevPorMin() {
            return revPorMin;
        }
        
        public String toString() {
            return "de motor: " + numMotor + ", Revoluciones por Minuto: " + revPorMin;
        }
    }

}

	

