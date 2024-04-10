package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	private int remuneration;

	CompteTaux(String num, int solde, int remuneration) {
		super(num, solde);
		this.remuneration = remuneration;

	}

	@Override
	public String toString() {
		return "CompteTaux remuneration=" + remuneration + ", num=" + getNumCompte() + ", solde=" + getSolde() + "]";
	}

	public int getRemuneration() {
		return remuneration;
	}

	public void setRemuneration(int remuneration) {
		this.remuneration = remuneration;
	}


}
