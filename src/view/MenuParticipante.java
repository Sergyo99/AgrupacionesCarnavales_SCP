package view;

public class MenuParticipante {

	private static void mostrarMenuIntegrantes() {
		Util.escribir("\n");
		Util.escribir("                            ");
		Util.escribir("  GESTION DE PARTICIPANTES  ");
		Util.escribir("                            ");
		Util.escribir("  1. Añadir un participante.");
		Util.escribir("  2. Borrar un participante.");
		Util.escribir("  3. Editar los datos de un participante.");
		Util.escribir("  4. Listar todos los participantes.");
		Util.escribir("  5. Listar agrupaciones donde es integrante.");
		Util.escribir("  6. Ordenar por el nombre.");
	}

	static void opcIntegrante() {
		int opc;
		do {
			mostrarMenuIntegrantes();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {
			case 1 -> OpcionParticipante.addIntegrante();
			case 2 -> OpcionParticipante.delIntegrante();
			case 3 -> OpcionParticipante.editIntegrante();
			case 4 -> OpcionParticipante.listarIntegrantes();
			case 5 -> OpcionParticipante.listarIntegrantes();
			}
		} while (opc != 0);
	}
}
