package model;

public abstract class Agrupacion implements Comparable<Agrupacion>{

	private String nombre;
	private String autor;
	private String autorMusica;
	private String autorLetra;
	private String tipoDisfraz;
	
	public Agrupacion() {
		this("", "", "", "", "");
	}
	
	public Agrupacion(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz) {
		setNombre(nombre);
		setAutor(autor);
		setAutorMusica(autorMusica);
		setAutorLetra(autorLetra);
		setTipoDisfraz(tipoDisfraz);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAutorMusica() {
		return autorMusica;
	}

	public void setAutorMusica(String autorMusica) {
		this.autorMusica = autorMusica;
	}

	public String getAutorLetra() {
		return autorLetra;
	}

	public void setAutorLetra(String autorLetra) {
		this.autorLetra = autorLetra;
	}

	public String getTipoDisfraz() {
		return tipoDisfraz;
	}

	public void setTipoDisfraz(String tipoDisfraz) {
		this.tipoDisfraz = tipoDisfraz;
	}
	
	public abstract String cantarPresentacion();
	
	public abstract String hacerTipo();

	@Override
	public int compareTo(Agrupacion o) {
		return this.getNombre().compareTo(o.getNombre());
	}
	
	@Override
	public String toString() {
		return "Agrupacion [Nombre:" + getNombre() + ", Autor:" + getAutor() + ", Autor De La Musica:"
				+ getAutorMusica() + ", Autor De La Letra:" + getAutorLetra() + ", Tipo Disfraz:" + getTipoDisfraz() + "]";
	}
	
}
