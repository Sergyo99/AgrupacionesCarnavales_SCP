package model;

import java.util.Comparator;

public class SortByAutorMusica implements Comparator<Agrupacion>{

	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		int comp = o1.getAutorMusica().compareTo(o2.getAutorMusica());

		if (comp == 0) {
			return o1.getAutorLetra().compareTo(o2.getAutorLetra());
		} else {
			return comp;
		}
	}

}
