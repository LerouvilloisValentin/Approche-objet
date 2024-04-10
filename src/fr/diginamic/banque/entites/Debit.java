package fr.diginamic.banque.entites;

public class Debit extends Operation {

	private int debit1;
	private int debit2;

	public Debit(String date, int montant, int debit1, int debit2) {
		super(date, montant);
		this.debit1 = debit1;
		this.debit2 = debit2;
	}
	
	public int calculateDebit(int debit1, int debit2) {
		int result= debit1 - debit2;
		return result;
	}

	@Override
	public String toString() {
		return "Date opération = " + getDate()+ ", montant = " + getMontant();
	}
	
	public String getType() {
		return "DEBIT";
	}
	
	public int getDebit1() {
		return debit1;
	}

	public void setDebit1(int debit1) {
		this.debit1 = debit1;
	}

	public int getDebit2() {
		return debit2;
	}

	public void setDebit2(int debit2) {
		this.debit2 = debit2;
	}
}
