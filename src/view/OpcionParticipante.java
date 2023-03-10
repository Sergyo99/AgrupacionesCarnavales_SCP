package view;

import model.Integrante;

public class OpcionParticipante {

	public static void addIntegrante() {
		int opc = 1;
		do {
			Integrante i = new Integrante();
			datosIntegrantes(i);
			Principal.coac.inscribir_participante(i);
			if(!Principal.algoMas()) {opc = 0;};
		} while (opc != 0);
	}
	
	public static void delIntegrante() {
		int opc;
		do {
			listarIntegrantes();
			opc = Util.leerInt("¿cuál quieres borrar?: ");
			opc --;
			Principal.coac.eliminar_participante(Principal.coac.getIntegrante()[opc]);
			if(!Principal.algoMas()) {opc = 0;}
		} while (opc != 0);
	}
	
	public static void editIntegrante() {
		int opc;
		do {
			listarIntegrantes();
			opc = Util.leerInt("¿Cuál quieres editar?: ");
			opc --;
			datosIntegrantes((Principal.coac.getIntegrante()[opc]));
			if(!Principal.algoMas()) {opc = 0;}
		} while (opc != 0);
	}
	
	public static void datosIntegrantes(Integrante a) {
		String pregunta;
		String respuesta;
		int res;
		
		pregunta = "Nombre" + ( (a.getNombre() == null) ? ": " 
				: "[" + a.getNombre() + "]: ");
		
		respuesta = Util.leerString(pregunta);
		if(respuesta.length()>0) a.setNombre(respuesta);
		
		pregunta = "Edad" + ( (a.getEdad() == null) ? ": " 
				: "[" + a.getEdad() + "]: ");
		
		res = Util.leerInt(pregunta);
		if(respuesta.length() != 0) a.setEdad(res);
		
		pregunta = "Localidad" + ( (a.getLocalidadParticipante() == null) ? ": " 
				: "[" + a.getLocalidadParticipante() + "]: ");
		
		respuesta = Util.leerString(pregunta);
		if(respuesta.length()>0) a.setLocalidadParticipante(respuesta);
	}
	
	public static void listar(Integrante[] a) {
		int cont = 1;
		for (int i = 0; i < a.length; i++) {
			if(a[i] != null) {
				System.out.println((cont++) + ". " + a[i]);
			}
		}
	}
	
	public static void listarIntegrantes() {
		Integrante [] aux = Principal.coac.getIntegrante();
		listar(aux);
	}
	
	public void ordenar() {
		Principal.coac.ordenarIntegrante();
		listarIntegrantes();
	}
	
}
