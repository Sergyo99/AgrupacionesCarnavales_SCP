package view;

import controller.COAC;
import model.Chirigota;
import model.Comparsa;
import model.Coro;
import model.Cuarteto;
import model.Romancero;

public class Principal {

	public static final int TOTAL = 20;
	
	public static COAC coac = new COAC(TOTAL);
	
	public static void main(String[] args) {
		
		Chirigota o1 = new Chirigota();
		o1.setNombre("Este año venimos con Esperanza");
		o1.setAutorLetra("Moisés y José Antonio");
		o1.setAutorMusica("José Antonio");
		o1.setAutor("José Antonio");
		coac.inscribir_agrupacion(o1);
		
		Comparsa o3 = new Comparsa();
		o3.setNombre("El Andalú");
		o3.setAutorLetra("José Manuel");
		o3.setAutorMusica("Ramón");
		o3.setAutor("Ramón");
		coac.inscribir_agrupacion(o3);
		
		Coro o5 = new Coro();
		o5.setNombre("La Voz");
		o5.setAutorLetra("Luis Manuel y Juan Manuel");
		o5.setAutorMusica("Luis Manuel y Juan Manuel");
		o5.setAutor("Laura Rivero");
		coac.inscribir_agrupacion(o5);
		
		Cuarteto o7 = new Cuarteto();
		o7.setNombre("Los Vigilantes de la Laja");
		o7.setAutorLetra("Manuel y Francisco Joshua");
		o7.setAutorMusica("Alejandro");
		o7.setAutor("LuManuelcia");
		coac.inscribir_agrupacion(o7);
		
		Romancero o9 = new Romancero();
		o9.setNombre("Dia a dia");
		o9.setAutorLetra("Tomás");
		o9.setAutorMusica("Joaquin");
		o9.setAutor("Manolo");
		coac.inscribir_agrupacion(o9);
		
		gestionPrograma();
	}
	
	private static void gestionPrograma() {
		int opc;
		do {
			mostrarMenuPrincipal();
			opc = Util.leerInt("Opción [0 - Salir] : ");
			switch (opc) {
			case 1 -> MenuParticipante.opcIntegrante();
			case 2 -> TipoAgrupacion.addAgrupacion();
			case 3 -> TipoAgrupacion.delAgrupacion();
			case 4 -> TipoAgrupacion.editAgrupacion();
			case 5 -> MenuConcurso.opcConcurso();
			case 6 -> TipoListado.listarTodo();
			case 7 -> TipoListado.listarChirigota();
			case 8 -> TipoListado.listarCoro();
			case 9 -> TipoListado.listarCuarteto();
			case 10 -> TipoListado.listarComparsa();
			case 11 -> TipoListado.listarRomancero();
			case 12 -> TipoOrdenacion.ordenarNombre();
			case 13 -> TipoOrdenacion.ordenarAutor();
			case 14 -> TipoOrdenacion.ordenarMusicaLetra();
			}
		} while (opc != 0);
		finDelPrograma();
	}

	private static void mostrarMenuPrincipal() {
		Util.escribir("\n");
		Util.escribir("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		Util.escribir("$                                   $");
		Util.escribir("$       GESTION DE AGRUPACIONES     $");
		Util.escribir("$                                   $");
		Util.escribir("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		Util.escribir(" ");
		Util.escribir("  1. Gestión de Participantes.");
		Util.escribir("  2. Añadir una agrupación.");
		Util.escribir("  3. Eliminar una agrupación.");
		Util.escribir("  4. Editar datos de una agrupación.");
		Util.escribir("  5. Gestión del Concurso.");
		Util.escribir("Listado de agrupaciones:");
		Util.escribir("  6. Listar todas.");
		Util.escribir("  7. Listar Chirigotas.");
		Util.escribir("  8. Listar Coros.");
		Util.escribir("  9. Listar Cuartetos.");
		Util.escribir(" 10. Listar Comparsas.");
		Util.escribir(" 11. Listar Romanceros.");
		Util.escribir("Ordenar el listado:");
		Util.escribir(" 12. Ordenar por el nombre.");
		Util.escribir(" 13. Ordenar por el autor.");
		Util.escribir(" 14. Ordenar por el autor de música/letra.");
	}

	private static void finDelPrograma() {
		Util.escribir("\nFin del programa.");
		System.exit(0);
	}
	
	public static boolean algoMas() {
		boolean isOk = true;
		String resp = Util.leerString("\n¿Una más? (S/N): ");
		isOk = (resp.equalsIgnoreCase("s")) ? true : false;
		return isOk;
	}

}
