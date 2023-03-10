package model;

public class Integrante {

	private static Integer numeroParticipante = 0;
	private Integer numero;
	private String nombre;
	private Integer edad;
	private String localidadParticipante;
	
	public Integrante() {
		numeroParticipante++;
		setNumero(numeroParticipante);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getLocalidadParticipante() {
		return localidadParticipante;
	}

	public void setLocalidadParticipante(String localidadParticipante) {
		this.localidadParticipante = localidadParticipante;
	}
	
	public Integer getNumero() {
		return numero;
	}

	private void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "Integrante [Numero:" + getNumero() + ", Nombre:" + getNombre() + ", Edad:" + getEdad()
				+ ", Localidad del Participante:" + getLocalidadParticipante() + "]";
	}
	
}
