package view;

import controller.COAC;
import model.Agrupacion;

public class TipoListado {

	public static void listar(Agrupacion[] a) {
		int cont = 1;
		for (int i = 0; i < a.length; i++) {
			if(a[i] != null) {
				System.out.println((cont++) + ". " + a[i]);
			}
		}
	}
	
	static void listarTodo() {	
		Agrupacion [] aux = Principal.coac.getAgrupacion();
		listar(aux);
	}
	
	public static void listarChirigota() {
		Agrupacion [] aux = COAC.obtenerChirigota(Principal.coac.getAgrupacion());
		listar(aux);
	}
	
	public static void listarCoro() {	
		Agrupacion [] aux = COAC.obtenerCoro(Principal.coac.getAgrupacion());
		listar(aux);
	}
	
	public static void listarCuarteto() {	
		Agrupacion [] aux = COAC.obtenerCuarteto(Principal.coac.getAgrupacion());
		listar(aux);
	}
	
	public static void listarComparsa() {	
		Agrupacion [] aux = COAC.obtenerComparsa(Principal.coac.getAgrupacion());
		listar(aux);
	}
	
	public static void listarRomancero() {
		Agrupacion [] aux = COAC.obtenerRomancero(Principal.coac.getAgrupacion());
		listar(aux);
	}
	
	public static void listarOficial() {
		Agrupacion [] aux = COAC.obtenerOficial(Principal.coac.getAgrupacion());
		listar(aux);
	}
	
}
