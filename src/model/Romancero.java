package model;

public class Romancero extends Agrupacion implements Callejera{

	private String tematicaCartelon;
	
	public Romancero() {
		
	}

	public String getTematicaCartelon() {
		return tematicaCartelon;
	}

	public void setTematicaCartelon(String tematicaCartelon) {
		this.tematicaCartelon = tematicaCartelon;
	}
	
	@Override
	public String toString() {
		return "Romancero: " + super.toString() + ", Tematica Cartelon" + getTematicaCartelon();
	}
	
	@Override
	public String cantarPresentacion() {
		return "Cantando el Romancero" + this.getNombre();
	}
	
	@Override
	public String hacerTipo() {
		return "El Romancero va de" + this.getNombre() + "siendo" + this.getTipoDisfraz();
	}
	
	@Override
	public String amoAescucha() {
		return "Amo a escuchá el Romancero" + this.getNombre();
	}
	
}
