package maps;

public abstract class Ville implements Comparable<Villes> {
private String nom;
	
	private int nbHabitants;
	private String departement;
	public Villes(String nom, int nbHabitants, String departement) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.departement = departement;
	}
	
	
	public int compareTo(Villes autre) {
		if (this.nbHabitants > autre.getNbHabitants()) {
			return 1;
		}
		else if (this.nbHabitants <autre.getNbHabitants()) {
			return -1;
		}
		return 0;
	}
	
	public String toString() {
		return nom + " avec " + nbHabitants+" habitants";
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbHabitants() {
		return nbHabitants;
	}
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}


	

}
