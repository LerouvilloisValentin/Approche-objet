package fr.diginamic.testenumeration;

import java.util.Objects;

public class VilleContinent {
	String nom;
	int nbHabitants;
	Continent continent;
	
	

	/**
	 * @param nom
	 * @param nbHabitants
	 * @param continent
	 */
	public VilleContinent(String nom, int nbHabitants, Continent continent) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.continent = continent;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nbHabitants, nom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VilleContinent other = (VilleContinent) obj;
		return nbHabitants == other.nbHabitants && Objects.equals(nom, other.nom);
	}

	@Override
	public String toString() {
		return "VilleContinent [nom=" + nom + ", nbHabitants=" + nbHabitants + ", continent=" + continent + "]";
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

	/**
	 * @return the continent
	 */
	public Continent getContinent() {
		return continent;
	}

	/**
	 * @param continent the continent to set
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
	}
}
