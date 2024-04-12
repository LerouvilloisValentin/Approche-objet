package fr.diginamic.salaire;

public abstract class Intervenant {
	private String firstName;
	private String lastName;

	public Intervenant(String lastName, String firstName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public abstract double getSalaire();

	public void afficherDonnees(String firstName, String lastName,double salarySalarie  ) {
		System.out.println("Nom: " + lastName + ", Prénom: " + firstName + " Salaire " + salarySalarie);
	}
}
