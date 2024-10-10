package sesion6;

public class Pedido {
	 private String nombrePlato;
	 private String tipoPlato;
	 
	 public Pedido(String nombrePlato, String TipoPlato) {
		 this.nombrePlato = nombrePlato;
		 this.tipoPlato = TipoPlato;
	 }
	 
	 public String getNombrePlato() {
		 return nombrePlato;
	 }
	 
	 public void setNombrePlato(String nombrePlato) {
		 this.nombrePlato = nombrePlato;
	 }
	 
	 public String getTipoPlato() {
		 return tipoPlato;
	 }
	 public void setTipoPlato(String TipoPlato) {
		 this.tipoPlato = TipoPlato;
	 }
	 
	 @Override
	 public String toString() {
		 return "pedido : " + nombrePlato + " tipo: " + tipoPlato;
	 }
}





