package listes;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {

		
	
	public int compare(Ville o2, Ville o1) {
		
		return Integer.compare(o1.getNbHabitants(),o2.getNbHabitants()); 
	}
	
	}


