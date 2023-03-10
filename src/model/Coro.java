package model;

public class Coro extends AgrupacionOficial{

	private Integer numeroBandurrias;
	private Integer numeroGuitarras;
	
	public Coro() {
		
	}
	
	public Integer getNumeroBandurrias() {
		return numeroBandurrias;
	}
	
	public void setNumeroBandurrias(Integer numeroBandurrias) {
		this.numeroBandurrias = numeroBandurrias;
	}
	
	public Integer getNumeroGuitarras() {
		return numeroGuitarras;
	}
	
	public void setNumeroGuitarras(Integer numeroGuitarras) {
		this.numeroGuitarras = numeroGuitarras;
	}
	
	@Override
	public String toString() {
		return "Coro: " 
					+ super.toString() 
					+ ", Numero Bandurrias:" + getNumeroBandurrias()
					+ ", Numero Guitarras:" + getNumeroGuitarras();
	}
	
	@Override
	public String cantarPresentacion() {
		return "Cantando el Coro" + this.getNombre();
	}
	
	@Override
	public String hacerTipo() {
		return "El Coro va de" + this.getNombre() + "siendo" + this.getTipoDisfraz();
	}
	
	@Override
	public String caminitoDelFalla() {
		return "El Coro" + this.getNombre() + "va caminito del Falla";
	}
	
}
