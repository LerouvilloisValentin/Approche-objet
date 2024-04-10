package fr.diginamic.salaire;

public abstract class Intervenant {
	private String firstName;
	private String lastName;

	Intervenant(String lastName, String firstName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public abstract double getSalaire();
	
}
