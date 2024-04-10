package fr.diginamic.banque.entites;

public class Credit extends Operation {

	private int credit1;
	private int credit2;

	public Credit(String date, int montant, int credit1, int credit2) {
		super(date, montant);
		this.credit1 = credit1;
		this.credit2 = credit2;

	}

	public int calculateCredit(int credit1, int credit2) {
		int result = credit1 - credit2;
		return result;
	}

	public String getType() {
		return "CREDIT";
	}

	public int getcredit1() {
		return credit1;
	}

	@Override
	public String toString() {
		return "Date opération = " + getDate() + ", montant = " + getMontant();
	}

	public void setcredit1(int credit1) {
		this.credit1 = credit1;
	}

	public int getcredit2() {
		return credit2;
	}

	public void setcredit2(int credit2) {
		this.credit2 = credit2;
	}
}
