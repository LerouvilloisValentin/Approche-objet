package fr.diginamic.salaire;

public class Salarie extends Intervenant {

	private double salarySalarie;
	protected double salaryPerDay;
	protected int numberOfDays;

	public Salarie(String lastName, String firstName, double salarySalarie,
			double salaryPerDay,int numberOfDays) {
		super(lastName, firstName);
		this.salarySalarie = salarySalarie;
		this.salaryPerDay = salaryPerDay;
	    this.numberOfDays = numberOfDays;
		
	}
	
	public double getSalaire() {
		double res = numberOfDays * salaryPerDay;
		return res;
	}

	public double getSalarySalarie() {
		return salarySalarie;
	}

	public void setSalarySalarie(double salarySalarie) {
		this.salarySalarie = salarySalarie;
	}

	public double getSalaryPerDay() {
		return salaryPerDay;
	}

	public void setSalaryPerDay(double salaryPerDay) {
		this.salaryPerDay = salaryPerDay;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
}
