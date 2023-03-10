package view;

public class MenuConcurso {

	private static void mostrarMenuConcurso() {
		Util.escribir("\n");
		Util.escribir("                        ");
		Util.escribir("  GESTION DEL CONCURSO  ");
		Util.escribir("                        ");
		Util.escribir("Concurso:");
		Util.escribir("  1. Va camino del Falla.");
		Util.escribir("  2. Hacen el Tipo.");
		Util.escribir("  3. Canta la Presentación.");
		Util.escribir("  4. Asignar puntos.");
		Util.escribir("Listado de agrupaciones participantes:");
		Util.escribir("  5. Listar todos.");
		Util.escribir("  6. Listar Chirigotas.");
		Util.escribir("  7. Listar Coros.");
		Util.escribir("  8. Listar Cuartetos.");
		Util.escribir("  9. Listar Comparsas.");
		Util.escribir("Ordenación del listado:");
		Util.escribir(" 10. Ordenar por puntos.");
		Util.escribir(" 11. Ordenar por el nombre.");
		Util.escribir(" 12. Ordenar por el autor.");
		Util.escribir(" 13. Ordenar por autor de música/letra.");
	}

	static void opcConcurso() {
		int opc;
		do {
			mostrarMenuConcurso();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {
			case 1 -> OpcionConcurso.caminito();
			case 2 -> OpcionConcurso.hacerTipo();
			case 3 -> OpcionConcurso.cantaPresentacion();
			case 4 -> OpcionConcurso.editPuntos();
			case 5 -> TipoListado.listarOficial();
			case 6 -> TipoListado.listarChirigota();
			case 7 -> TipoListado.listarCoro();
			case 8 -> TipoListado.listarCuarteto();
			case 9 -> TipoListado.listarComparsa();
			case 10 -> OpcionConcurso.ordernarPunto();
			case 11 -> OpcionConcurso.ordenarNombre();
			case 12 -> OpcionConcurso.ordenarAutor();
			case 13 -> OpcionConcurso.ordenarMusicaLetra();
			}
		} while (opc != 0);
	}

}
