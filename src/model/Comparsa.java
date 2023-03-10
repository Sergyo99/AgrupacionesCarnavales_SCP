package model;

public class Comparsa extends AgrupacionOficial implements Callejera{

	private String empresaAtrezzo;
	
	public Comparsa() {
		
	}

	public String getEmpresaAtrezzo() {
		return empresaAtrezzo;
	}

	public void setEmpresaAtrezzo(String empresaAtrezzo) {
		this.empresaAtrezzo = empresaAtrezzo;
	}
	
	@Override
	public String toString() {
		return "Comparsa: " + super.toString() + ", Empresa Atrezzo" + getEmpresaAtrezzo();
	}
	
	@Override
	public String cantarPresentacion() {
		return "Cantando la Comparsa" + this.getNombre();
	}
	
	@Override
	public String hacerTipo() {
		return "La Comparsa va de" + this.getNombre() + "siendo" + this.getTipoDisfraz();
	}
	
	@Override
	public String caminitoDelFalla() {
		return "La Comparsa" + this.getNombre() + "va caminito del Falla";
	}
	
	@Override
	public String amoAescucha() {
		return "Amo a escuchá la Comparsa" + this.getNombre();
	}
	
}
