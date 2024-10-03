package actividades;

public class actividad4 {
	public class Persona{
		private int id;
		private String nombre;
		private String apellido;
		private Cuenta cuenta;
		
		public Persona(int id, String nombre, String apellido, int numero, double saldo) {
			this.id = id;
			this.nombre = nombre;
			this.apellido = apellido;
			this.cuenta = new Cuenta(numero, saldo);	
		}
		//setter
		public void setId (int id) {
			this.id = id;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public void setCuenta(Cuenta cuenta) {
			this.cuenta = cuenta;
		}
		//getter
		public int getId() {
			return id;
		}
		public String getNombre() {
			return nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public Cuenta getCuenta() {
			return cuenta;
		}
			
		public String toString() {
			return "ID: "+id+ ", nombre: "+nombre+", apellido: "+apellido+", cuenta: "+ cuenta;
		}
	
	}
	
	public class Cuenta{
		private int numero;
		private double saldo;
		
		public Cuenta(int numero, double saldo) {
			this.numero = numero;
			this.saldo = saldo;
		}
		public Cuenta(int numero) {
			this(numero, 0);
		}
		//setter
		public void setNumero(int numero) {
			this.numero = numero;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		//getter
		public int getNumero() {
			return numero;
		}
		public double getSaldo() {
			return saldo;
		}
		
		public String toString() {
			return numero+", saldo: "+saldo;
		}
		
	}
	public static void main(String[] args) {
        actividad4 outerClass = new actividad4();

        Persona persona1 = outerClass.new Persona(74124214, "Kimberly", "Barra", 2034000212, 12300.98);

        System.out.println(persona1);
    }

}
