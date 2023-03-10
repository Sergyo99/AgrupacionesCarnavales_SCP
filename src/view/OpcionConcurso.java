package view;

import controller.COAC;
import model.Agrupacion;
import model.AgrupacionOficial;
import model.Chirigota;
import model.Comparsa;
import model.Coro;
import model.Cuarteto;

public class OpcionConcurso {

	static void caminito() {
		int opc;
		String salida;
		Agrupacion [] aux = COAC.obtenerOficial(Principal.coac.getAgrupacion());
		do {
			TipoListado.listarOficial();
			opc = Util.leerInt("\n¿Cuál quieres?: ");
			opc--;

			switch(aux[opc].getClass().getCanonicalName()) {
			case "Chirigota" -> salida =  ((Chirigota) aux[opc]).caminitoDelFalla();
			case "Comparsa" -> salida = ((Comparsa) aux[opc]).caminitoDelFalla();
			case "Coro" -> salida = ((Coro) aux[opc]).caminitoDelFalla();
			case "Cuarteto" -> salida = ((Cuarteto) aux[opc]).caminitoDelFalla();
			default -> salida = "";
			}
			
			System.out.println("\n" + salida);
			if(!Principal.algoMas()) {opc = 0;}
		} while (opc != 0);
	}
	
	static void hacerTipo() {
		int opc;
		String salida;
		Agrupacion [] aux = COAC.obtenerOficial(Principal.coac.getAgrupacion());
		do {
			TipoListado.listarOficial();
			opc = Util.leerInt("\n¿Cuál quieres?: ");
			opc--;
			
			switch(aux[opc].getClass().getCanonicalName()) {
			case "Chirigota" -> salida =((Chirigota) aux[opc]).hacerTipo();
			case "Comparsa" -> salida = ((Comparsa) aux[opc]).hacerTipo();
			case "Coro" -> salida = ((Coro) aux[opc]).hacerTipo();
			case "Cuarteto" -> salida = ((Cuarteto) aux[opc]).hacerTipo();
			default -> salida = "";
			}
			
			System.out.println("\n" + salida);
			if(!Principal.algoMas()) {opc = 0;}
		} while (opc != 0);
	}
	
	static void cantaPresentacion() {
		int opc;
		String salida;
		Agrupacion [] aux = COAC.obtenerOficial(Principal.coac.getAgrupacion());
		do {
			TipoListado.listarOficial();
			opc = Util.leerInt("\n¿Cuál quieres?: ");
			opc--;
			
			switch(aux[opc].getClass().getCanonicalName()) {
			case "Chirigota" -> salida = ((Chirigota) aux[opc]).cantarPresentacion();
			case "Comparsa" -> salida = ((Comparsa) aux[opc]).cantarPresentacion();
			case "Coro" -> salida = ((Coro) aux[opc]).cantarPresentacion();
			case "Cuarteto" -> salida = ((Cuarteto) aux[opc]).cantarPresentacion();
			default -> salida = "";
			}
		
			System.out.println("\n" + salida);
			if(!Principal.algoMas()) {opc = 0;}
		} while (opc != 0);
	}
	
	static void editPuntos() {
		int opc;
		Agrupacion [] aux = COAC.obtenerOficial(Principal.coac.getAgrupacion());
		do {
			System.out.println();
			TipoListado.listarOficial();
			opc = Util.leerInt("¿Cuál quieres editar?: ");
			datoOficial((AgrupacionOficial)(aux[opc - 1]));
			if(!Principal.algoMas()) {opc = 0;}
		} while (opc != 0);
	}
	
	static void datoOficial(AgrupacionOficial a) {
		String pregunta;
		int respuesta;
		
		pregunta = "Puntos obtenidos" + ( (a.getPuntosObtenidos() == null) ? ": " : "[" + a.getPuntosObtenidos() + "]: ");
		respuesta = Util.leerInt(pregunta);
		if(respuesta != 0) a.setPuntosObtenidos(respuesta);
	}
	
	static void ordernarPunto() {
		Principal.coac.ordenarPorPuntos();
		TipoListado.listarOficial();
	}
	
	static void ordenarNombre() {
		Principal.coac.ordenarPorNombre();;
		TipoListado.listarOficial();
	}
	
	static void ordenarAutor() {
		Principal.coac.ordenarPorAutor();;
		TipoListado.listarOficial();
	}
	
	static void ordenarMusicaLetra() {
		Principal.coac.ordenarPorAutorMusicaLetra();
		TipoListado.listarOficial();
	}
	
}
