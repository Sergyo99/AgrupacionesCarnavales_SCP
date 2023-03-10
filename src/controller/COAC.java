package controller;

import java.util.Arrays;

import model.Agrupacion;
import model.AgrupacionOficial;
import model.Chirigota;
import model.Comparsa;
import model.Coro;
import model.Cuarteto;
import model.Integrante;
import model.Romancero;
import model.SortByAutor;
import model.SortByAutorMusica;
import model.SortIntegranteNombre;

public class COAC {
	
	private static final int AGRUPACIONESDEFECTO = 10;
	
	private static final int INTEGRANTESDEFECTO = 20;
	
	private Agrupacion[] agrupacion;
	
	private Integrante[] integrante;
	
	public COAC(int total) {
		agrupacion = new Agrupacion[AGRUPACIONESDEFECTO];
		integrante = new Integrante[INTEGRANTESDEFECTO];
	}
	
	public Agrupacion[] getAgrupacion() {
		return agrupacion;
	}
	
	public void setAgrupacion(Agrupacion[] agrupaciones) {
		this.agrupacion = agrupaciones;
	}
	
	public Integrante[] getIntegrante() {
		return integrante;
	}

	public void setIntegrantes(Integrante[] integrantes) {
		this.integrante = integrantes;
	}
	
	public boolean inscribir_agrupacion(Agrupacion a) {
		boolean add = false;

		for (int i = 0; i < agrupacion.length; i++) {
			if (agrupacion[i] == null) {
				agrupacion[i] = a;
				add = true;
				break;
			}
		}

		return add;

	}
	
	public boolean eliminar_agrupacion(Agrupacion a) {
		boolean del = false;

		for (int j = 0; j < agrupacion.length; j++) {
			if (agrupacion[j] == a) {
				agrupacion[j] = null;
				del = true;
				break;
			}
		}

		return del;

	}
	
	public boolean inscribir_participante(Integrante a) {
		boolean added = false;
		boolean isOK = false;
		
		for (int i = 0; i < integrante.length; i++) {
			if (integrante[i] != null && integrante[i].equals(a)) {
				isOK = true;
				break;
			}
		}
		
		if (!isOK) {
			for (int p = 0; p < integrante.length; p++) {
				if (integrante[p] == null) {
					integrante[p] = a;
					added = true;
					break;
				}
			}
		}
		return added;
	}
	
	public boolean eliminar_participante(Integrante a) {
		boolean deleted = false;
		for (int d = 0; d < integrante.length; d++) {
			if (integrante[d] != null && integrante[d].equals(a)) {
				integrante[d] = null;
				deleted = true;
				break;
			}
		}
		return deleted;
	}
	
	public static Agrupacion[] obtenerOficial(Agrupacion[] agrupacion) {
		int cont = 0;
		for (int i = 0; i < agrupacion.length; i++) {
			if (agrupacion[i] instanceof AgrupacionOficial) {
				 cont++;
			}
		}
		
		AgrupacionOficial[] agrupacionesOficial = new AgrupacionOficial[cont];
		cont = 0;
		for (int i = 0; i < agrupacion.length; i++) {
			if (agrupacion[i] instanceof AgrupacionOficial) {
				agrupacionesOficial[cont++] = (AgrupacionOficial) agrupacion[i] ;
			}
		}
		return agrupacionesOficial;
	}
	
	public static Agrupacion[] obtenerChirigota(Agrupacion[] agrupacion) {
		int cont = 0;
		for (int i = 0; i < agrupacion.length; i++) {
			if (agrupacion[i] instanceof Chirigota) {
				 cont++;
			}
		}
		
		Chirigota[] chirigota = new Chirigota[cont];
		cont = 0;
		for (int i = 0; i < agrupacion.length; i++) {
			if (agrupacion[i] instanceof Chirigota) {
				chirigota[cont++] = (Chirigota) agrupacion[i] ;
			}
		}
		return chirigota;
	}
	
	public static Agrupacion[] obtenerComparsa(Agrupacion[] agrupacion) {
		int cont = 0;
		for (int i = 0; i < agrupacion.length; i++) {
			if (agrupacion[i] instanceof Comparsa) {
				 cont++;
			}
		}
		
		Comparsa[] comparsa = new Comparsa[cont];
		cont = 0;
		for (int i = 0; i < agrupacion.length; i++) {
			if (agrupacion[i] instanceof Comparsa) {
				comparsa[cont++] = (Comparsa) agrupacion[i] ;
			}
		}
		return comparsa;
	}
	
	public static Agrupacion[] obtenerCoro(Agrupacion[] agrupacion) {
		int cont = 0;
		for (int i = 0; i < agrupacion.length; i++) {
			if (agrupacion[i] instanceof Coro) {
				 cont++;
			}
		}
		
		Coro[] coro = new Coro[cont];
		cont = 0;
		for (int i = 0; i < agrupacion.length; i++) {
			if (agrupacion[i] instanceof Coro) {
				coro[cont++] = (Coro) agrupacion[i] ;
			}
		}
		return coro;
	}
	
	public static Agrupacion[] obtenerCuarteto(Agrupacion[] agrupacion) {
		int cont = 0;
		for (int i = 0; i < agrupacion.length; i++) {
			if (agrupacion[i] instanceof Cuarteto) {
				 cont++;
			}
		}
		
		Cuarteto[] cuarteto = new Cuarteto[cont];
		cont = 0;
		for (int i = 0; i < agrupacion.length; i++) {
			if (agrupacion[i] instanceof Cuarteto) {
				cuarteto[cont++] = (Cuarteto) agrupacion[i] ;
			}
		}
		return cuarteto;
	}
	
	public static Agrupacion[] obtenerRomancero(Agrupacion[] agrupacion) {
		int cont = 0;
		for (int i = 0; i < agrupacion.length; i++) {
			if (agrupacion[i] instanceof Romancero) {
				 cont++;
			}
		}
		
		Romancero[] romancero = new Romancero[cont];
		cont = 0;
		for (int i = 0; i < agrupacion.length; i++) {
			if (agrupacion[i] instanceof Romancero) {
				romancero[cont++] = (Romancero) agrupacion[i] ;
			}
		}
		return romancero;
	}
	
	public void ordenarIntegrante() {
		Arrays.sort(integrante, new SortIntegranteNombre());
	}
	
	public void ordenarPorPuntos() {
		Arrays.sort(agrupacion);
	}
	
	public void ordenarPorNombre() {
        Arrays.sort(agrupacion, (a, b) -> a.getNombre().compareTo(b.getNombre()));
	}
	
	public void ordenarPorAutor() {
		Arrays.sort(agrupacion, new SortByAutor());
	}
	
	public void ordenarPorAutorMusicaLetra() {
		Arrays.sort(agrupacion, new SortByAutorMusica());
	}
	
}
