package fr.diginamic.recensement;



import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {

		
	public int compare(Ville o2, Ville o1) {
		
		return Integer.compare(o1.getPopTot(),o2.getPopTot()); 
	}
	
	}


