package model;

import java.util.Comparator;

public class SortByAgrupacionOfical implements Comparator<AgrupacionOficial>{

	@Override
	public int compare(AgrupacionOficial o1, AgrupacionOficial o2) {
		return o1.getPuntosObtenidos().compareTo(o2.getPuntosObtenidos());
	}

}
