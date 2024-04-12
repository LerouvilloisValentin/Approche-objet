package fr.diginamic.salaire;

public class Pigiste extends Salarie {

	public Pigiste(String lastName, String firstName, double salarySalarie, double salaryPerDay, int numberOfDays) {
		super(lastName, firstName, salarySalarie, salaryPerDay, numberOfDays);

	}

	public double getSalaire() {
		double res = super.getNumberOfDays() * super.getSalaryPerDay();
		return res;
	}

}
