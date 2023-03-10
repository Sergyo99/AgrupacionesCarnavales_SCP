package model;

public abstract class AgrupacionOficial extends Agrupacion{
	
	private Integer puntosObtenidos;
	public Integrante integrante[];
	
	public AgrupacionOficial() {
		
	}
	
	public AgrupacionOficial(int totalIntegrantes) {
		Integrante integrante[] = new Integrante[totalIntegrantes];
	}
	
	public abstract String caminitoDelFalla();
	
	public Integer getPuntosObtenidos() {
		return puntosObtenidos;
	}
	
	public void setPuntosObtenidos(Integer puntosObtenidos) {
		this.puntosObtenidos = puntosObtenidos;
	}
	
	public boolean insertarIntegrante(Integrante member) {
		boolean add = false;
		for (int i = 0; i < integrante.length; i++) {
			if (integrante[i] == null) {
				integrante[i] = member;
				add = true;
				break;
			}
		}
		return add;
	}
	
	public boolean eliminarIntegrante(Integrante member) {
		boolean del = false;
		for (int i = 0; i < integrante.length; i++) {
			if (integrante[i] != null && integrante[i].equals(member)) {
				integrante[i] = null;
				del = true;
				break;
			}
		}
		return del;
	}
	
	@Override
	public String toString() {
		return "AgrupacionOficial [Puntos Obtenidos:" + getPuntosObtenidos() + ", Nombre:" + getNombre()
				+ ", Autor:" + getAutor() + ", Autor De La Musica:" + getAutorMusica() + ", Autor De La Letra:"
				+ getAutorLetra() + ", Tipo Disfraz:" + getTipoDisfraz() + "]";
	}
	
}
