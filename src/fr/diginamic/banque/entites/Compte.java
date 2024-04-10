package fr.diginamic.banque.entites;

public class Compte {

	private String num;
	private int solde;
	
	public Compte(String num, int solde){
		super();
		this.num = num;
		this.solde = solde;
	}

	
	@Override
	public String toString() {
		return "Compte numCompte=" + num+ ", solde=" + solde;
	}

	public String getNumCompte() {
		return num;
	}

	public void setNumCompte(String numCompte) {
		this.num= numCompte;
	}


	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}

}
