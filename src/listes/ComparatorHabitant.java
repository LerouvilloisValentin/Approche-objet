package listes;

import java.util.Comparator;

import fr.diginamic.recensement.Ville2;

public class ComparatorHabitant implements Comparator<Ville> {

	public int compare(Ville o2, Ville o1) {

		return Integer.compare(o1.getNbHabitants(), o2.getNbHabitants());
	}

}
