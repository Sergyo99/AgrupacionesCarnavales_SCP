package view;

public class TipoOrdenacion {

	public static void ordenarNombre() {
		Principal.coac.ordenarPorNombre();
		TipoListado.listarTodo();
	}
	
	public static void ordenarAutor() {
		Principal.coac.ordenarPorAutor();;
		TipoListado.listarTodo();
	}
	
	public static void ordenarMusicaLetra() {
		Principal.coac.ordenarPorAutorMusicaLetra();
		TipoListado.listarTodo();
	}
	
}
