package model;

import java.util.Comparator;

public class SortIntegranteNombre implements Comparator<Integrante>{

	@Override
	public int compare(Integrante i1, Integrante i2) {
		int comp= 0;
		if(i1 != null && i2!=null) {
			comp = i1.getNombre().compareTo(i2.getNombre());
		}
		return comp;
	}

	
}
