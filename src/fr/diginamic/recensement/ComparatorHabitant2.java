package fr.diginamic.recensement;



import java.util.Comparator;

public class ComparatorHabitant2 implements Comparator<Ville2> {

		
	public int compare(Ville2 o2, Ville2 o1) {
		
		return Integer.compare(o1.getPopTot(),o2.getPopTot()); 
	}
	
	}


