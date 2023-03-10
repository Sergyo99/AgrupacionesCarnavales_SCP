package model;

public class Chirigota extends AgrupacionOficial implements Callejera{

	private Integer numeroCuples;
	
	public Chirigota() {
		
	}
	
	public Integer getNumeroCuples() {
		return numeroCuples;
	}
	
	public void setNumeroCuples(Integer numeroCuples) {
		this.numeroCuples = numeroCuples;
	}
	
	@Override
	public String toString() {
		return "Chirigota: " + super.toString() + ", Numero Cuples" + getNumeroCuples();
	}
	
	@Override
	public String cantarPresentacion() {
		return "Cantando la Chirigota" + this.getNombre();
	}
	
	@Override
	public String hacerTipo() {
		return "La Chirigota va de" + this.getNombre() + "siendo" + this.getTipoDisfraz();
	}
	
	@Override
	public String caminitoDelFalla() {
		return "La Chirigota" + this.getNombre() + "va caminito del Falla";
	}
	
	@Override
	public String amoAescucha() {
		return "Amo a escuchá la Chirigota" + this.getNombre();
	}
	
}
