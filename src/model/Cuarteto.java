package model;

public class Cuarteto extends AgrupacionOficial implements Callejera{

	private Integer numeroMiembros;
	
	public Cuarteto() {
		
	}

	public Integer getNumeroMiembros() {
		return numeroMiembros;
	}

	public void setNumeroMiembros(Integer numeroMiembros) {
		this.numeroMiembros = numeroMiembros;
	}
	
	@Override
	public String toString() {
		return "Cuarteto: " + super.toString() + ", Numero Miembros" + getNumeroMiembros();
	}
	
	@Override
	public String cantarPresentacion() {
		return "Cantando el Cuarteto" + this.getNombre();
	}
	
	@Override
	public String hacerTipo() {
		return "El Cuarteto va de" + this.getNombre() + "siendo" + this.getTipoDisfraz();
	}
	
	@Override
	public String caminitoDelFalla() {
		return "El Cuarteto" + this.getNombre() + "va caminito del Falla";
	}
	
	@Override
	public String amoAescucha() {
		return "Amo a escuchá el Cuarteto" + this.getNombre();
	}
	
}
