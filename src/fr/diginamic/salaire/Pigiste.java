package fr.diginamic.salaire;

public class Pigiste extends Salarie {

	private int numberOfDays;
	private double salaryPerDay;

	public Pigiste(String lastName, String firstName, double salarySalarie, double salaryPerDay, int numberOfDays) {
		super(lastName, firstName, salarySalarie, salaryPerDay, numberOfDays);

	}

	public double getSalaire() {
		double res = numberOfDays * salaryPerDay;
		return res;
	}

}
