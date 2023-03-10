package view;

import model.Agrupacion;
import model.Chirigota;
import model.Comparsa;
import model.Coro;
import model.Cuarteto;
import model.Romancero;

public class TipoAgrupacion {

	private static void mostrarmenuTipoAgrupaciones() {
		Util.escribirLn("\n");
		Util.escribirLn("┌───────────────────────┐");
		Util.escribirLn("│ TIPOS DE AGRUPACIONES │");
		Util.escribirLn("└───────────────────────┘");
		Util.escribirLn("  1. Coro.");
		Util.escribirLn("  2. Comparsa.");
		Util.escribirLn("  3. Chirigota.");
		Util.escribirLn("  4. Cuarteto.");
		Util.escribirLn("  5. Romancero.");
	}
	
	static void addAgrupacion() {
		int opc;
		do {
			mostrarmenuTipoAgrupaciones();
			opc = Util.leerInt("Opción: ");
			switch (opc) {
			case 1 -> addCoro();
			case 2 -> addComparsa();
			case 3 -> addChirigota();
			case 4 -> addcuarteto();
			case 5 -> addRomancero();
			}
			if(!Principal.algoMas()) {opc = 0;};
		} while (opc != 0);
	}
	
	static void delAgrupacion() {
		int opc;
		do {
			TipoListado.listarTodo();
			opc = Util.leerInt("¿cuál quieres borrar?: ");
			Principal.coac.eliminar_agrupacion(Principal.coac.getAgrupacion()[opc-1]);
			if(!Principal.algoMas()) {opc = 0;}
		} while (opc != 0);
	}
	
	static void editAgrupacion() {
		int opc;
		do {
			System.out.println();
			TipoListado.listarTodo();
			opc = Util.leerInt("¿Cuál quieres editar?: ");
			opc --;
			datosAgrupaciones((Principal.coac.getAgrupacion()[opc]));
			
			switch(Principal.coac.getAgrupacion()[opc].getClass().getCanonicalName()) {
			case "Chirigota" -> datoChirigota((Chirigota) (Principal.coac.getAgrupacion()[opc]));
			case "Comparsa" -> datoComparsa((Comparsa) (Principal.coac.getAgrupacion()[opc]));
			case "Coro" -> datoCoro((Coro) (Principal.coac.getAgrupacion()[opc]));
			case "Cuarteto" -> datoCuarteto((Cuarteto) (Principal.coac.getAgrupacion()[opc]));
			case "Romancero" -> datoRomancero((Romancero) (Principal.coac.getAgrupacion()[opc]));
			default -> opc = Util.leerInt("¿Cuál quieres editar?: "); 
			}
			if(!Principal.algoMas()) {opc = 0;}
		} while (opc != 0);
	}
	
	private static void datosAgrupaciones(Agrupacion a) {
		String pregunta;
		String respuesta;
		
		pregunta = "Nombre" + ( (a.getNombre() == null) ? ": " : "[" + a.getNombre() + "]: ");
		respuesta = Util.leerString(pregunta);
		if(respuesta.length()>0) a.setNombre(respuesta);
		
		pregunta = "Autor" + ( (a.getAutor() == null) ? ": " : "[" + a.getAutor() + "]: ");
		respuesta = Util.leerString(pregunta);
		if(respuesta.length()>0) a.setAutor(respuesta);
		
		pregunta = "Autor de la Música" + ( (a.getAutorMusica() == null) ? ": " : "[" + a.getAutorMusica() + "]: ");
		respuesta = Util.leerString(pregunta);
		if(respuesta.length()>0) a.setAutorMusica(respuesta);
		
		pregunta = "Autor de la Letra" + ( (a.getAutorLetra() == null) ? ": " : "[" + a.getAutorLetra() + "]: ");
		respuesta = Util.leerString(pregunta);
		if(respuesta.length()>0) a.setAutorLetra(respuesta);
		
		pregunta = "Tipo" + ( (a.getTipoDisfraz() == null) ? ": " : "[" + a.getTipoDisfraz() + "]: ");
		respuesta = Util.leerString(pregunta);
		if(respuesta.length()>0) a.setTipoDisfraz(respuesta);

	}
	
	
	static void addChirigota() {
		Chirigota ch = new Chirigota();
		datosAgrupaciones(ch);
		datoChirigota(ch);
		Principal.coac.inscribir_agrupacion(ch);
	}
	
	static void addCoro() {
		Coro c = new Coro();
		datosAgrupaciones(c);
		datoCoro(c);
		Principal.coac.inscribir_agrupacion(c);
	}
	
	static void addComparsa() {
		Comparsa com = new Comparsa();
		datosAgrupaciones(com);
		datoComparsa(com);
		Principal.coac.inscribir_agrupacion(com);
	}
	
	static void addcuarteto() {
		Cuarteto cu = new Cuarteto();
		datosAgrupaciones(cu);
		datoCuarteto(cu);
		Principal.coac.inscribir_agrupacion(cu);
	}
	
	static void addRomancero() {
		Romancero r = new Romancero();
		datosAgrupaciones(r);
		datoRomancero(r);
		Principal.coac.inscribir_agrupacion(r);
	}
	
	private static void datoChirigota(Chirigota a) {
		String pregunta;
		int respuesta;
		
		pregunta = "Número de Cuplés" + ( (a.getNumeroCuples() == null) ? ": " : "[" + a.getNumeroCuples() + "]: ");
		respuesta = Util.leerInt(pregunta);
		if(respuesta > 0) a.setNumeroCuples(respuesta);
	}
	
	private static void datoCoro(Coro a) {
		String pregunta;
		int respuesta;
		
		pregunta = "Número de Bandurrias" + ( (a.getNumeroBandurrias() == null) ? ": " : "[" + a.getNumeroBandurrias() + "]: ");
		respuesta = Util.leerInt(pregunta);
		if(respuesta > 0) a.setNumeroBandurrias(respuesta);
		
		pregunta = "Número de Guitarras" + ( (a.getNumeroGuitarras() == null) ? ": " : "[" + a.getNumeroGuitarras() + "]: ");
		respuesta = Util.leerInt(pregunta);
		if(respuesta > 0) a.setNumeroGuitarras(respuesta);
	}
	
	private static void datoComparsa(Comparsa a) {
		String pregunta;
		String respuesta;
		
		pregunta = "Empresa de Atrezzo" + ( (a.getEmpresaAtrezzo() == null) ? ": " : "[" + a.getEmpresaAtrezzo() + "]: ");
		respuesta = Util.leerString(pregunta);
		if(respuesta.length()>0) a.setEmpresaAtrezzo(respuesta);
	}
	
	private static void datoCuarteto(Cuarteto a) {
		String pregunta;
		int respuesta;
		
		pregunta = "Número de Miembros" + ( (a.getNumeroMiembros() == null) ? ": " : "[" + a.getNumeroMiembros() + "]: ");
		respuesta = Util.leerInt(pregunta);
		if(respuesta > 0) a.setNumeroMiembros(respuesta);
	}
	
	private static void datoRomancero(Romancero a) {
		String pregunta;
		String respuesta;
		
		pregunta = "Tematica del Cartelón" + ( (a.getTematicaCartelon() == null) ? ": " : "[" + a.getTematicaCartelon() + "]: ");
		respuesta = Util.leerString(pregunta);
		if(respuesta.length()>0) a.setTematicaCartelon(respuesta);
	}
	
}
